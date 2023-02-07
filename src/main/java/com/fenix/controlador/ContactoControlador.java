package com.fenix.controlador;


import com.fenix.modelo.Contacto;
import com.fenix.servicio.ServicioContacto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ContactoControlador {

    private final ServicioContacto servicio;

    public ContactoControlador(ServicioContacto servicio) {
        this.servicio = servicio;
    }

    @GetMapping({"/",""})
    public String verPaginaDeinicio(Model modelo){
modelo.addAttribute("contactos", servicio.ListarContacto());
        return "index";
    }

    @GetMapping("/nuevo")
    public String MostrarFormularioDeRegistratContacto(Model modelo){

        modelo.addAttribute("contacto", new Contacto());

        return "nuevo";
      }

      @PostMapping("/nuevo")
    public String guardarContacto(Contacto contacto, RedirectAttributes redirect){
        servicio.AgregarContacto(contacto);
        redirect.addFlashAttribute("msgExito", "El contacto ha sido agregado con exito");
        return "redirect:/";
      }

}
