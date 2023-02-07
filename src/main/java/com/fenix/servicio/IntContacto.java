package com.fenix.servicio;

import com.fenix.modelo.Contacto;

import java.util.List;

public interface IntContacto {

     List<Contacto> ListarContacto();
    void AgregarContacto(Object contacto);
    void EliminarContacto(long id);
    void obtenerContacto(long id);
    void actualizarContacto(long id);
}
