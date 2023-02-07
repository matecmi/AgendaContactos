package com.fenix.controlador;


import com.fenix.modelo.Contacto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ContactoControlador {

    @GetMapping({"/",""})
    public String verPaginaDeinicio(){

        return "index";
    }

    @GetMapping("/nuevo")
    public String MostrarFormularioDeRegistratContacto(Model modelo){

        modelo.addAttribute("contacto", new Contacto());

        return "nuevo";
      }

}
