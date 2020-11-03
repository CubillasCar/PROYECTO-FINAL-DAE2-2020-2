package pe.isil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.isil.model.Paciente;
import pe.isil.service.PacienteService;

@Controller
public class PacienteController {


    private final PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }


    @GetMapping("/pacientes")
    public String pacienteList(Model model) {
        model.addAttribute("pacientes", pacienteService.findAll());
        return "pacientes";
    }

    @GetMapping("/pacientes/add")
    public String pacienteAdd(Model model) {
        model.addAttribute("paciente", new Paciente());
        return "pacienteAdd";
    }

    @PostMapping("/pacientes/save")
    public String pacienteSave(Paciente paciente) {
        pacienteService.createOrUpdate(paciente);
        return "redirect:/pacientes";

    }

    @GetMapping("pacientes/edit/{id}")
    public String pacienteEdit(Model model, @PathVariable Integer id) {
        model.addAttribute("paciente", pacienteService.findById(id));
        return "pacienteAdd";
    }

    @GetMapping("/pacientes/delete/{id}")
    public String pacienteDelete(Model model, @PathVariable Integer id) {
        pacienteService.deleteById(id);
        return "redirect:/pacientes";
    }

}
