package pe.isil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.isil.model.Especialidad;
import pe.isil.service.EspecialidadService;

@Controller
public class EspecialidadController {


    private final EspecialidadService especialidadService;

    public EspecialidadController(EspecialidadService especialidadService) {
        this.especialidadService = especialidadService;
    }

    @GetMapping("/especialidades")
    public String especialidadList(Model model){
        model.addAttribute("especialidades", especialidadService.findAll());
        return "especialidades";
    }

    @GetMapping("/especialidades/add")
    public String especialidadAdd(Model model){
        model.addAttribute("especialidad", new Especialidad());
        return "especialidadAdd";
    }


}
