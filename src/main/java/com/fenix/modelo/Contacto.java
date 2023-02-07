package com.fenix.modelo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Contacto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Debe ingresar su nombre")
    private String nombre;
    @NotEmpty(message = "Debe ingresar su email")
    @Email
    private String email;
    @NotBlank(message = "debe ingresar su celular")
    private String celular;

    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    @Past
    @NotNull(message = "Debe ingresar su fecha de nacimiento")
    private LocalDate fechaNacimiento;

    private LocalDateTime fechaRegistro;

    public Contacto() {
    }

    public Contacto(Integer id, String nombre, String email, String celular, LocalDate fechaNacimiento, LocalDateTime fechaRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    @PrePersist
    public void asignarFechaRegistro(){
        this.fechaRegistro=LocalDateTime.now();
}
}
