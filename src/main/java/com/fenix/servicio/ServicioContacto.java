package com.fenix.servicio;

import com.fenix.modelo.Contacto;
import com.fenix.repositorio.ContactoRepositorio;

import java.util.List;

public class ServicioContacto implements IntContacto{


    private final ContactoRepositorio repositorio;

    public ServicioContacto(ContactoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Contacto> ListarContacto() {
        return repositorio.findAll();
    }

    @Override
    public void AgregarContacto() {

    }

    @Override
    public void EliminarContacto(long id) {

    }

    @Override
    public void obtenerContacto(long id) {

    }

    @Override
    public void actualizarContacto(long id) {

    }
}
