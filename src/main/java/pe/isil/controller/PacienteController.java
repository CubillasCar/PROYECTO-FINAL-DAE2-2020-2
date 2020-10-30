package pe.isil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.isil.model.Paciente;
import pe.isil.service.IPacienteService;

import javax.jws.WebParam;
import java.util.List;

@Controller
public class PacienteController {

    @Autowired
    IPacienteService iPacienteService;


    @GetMapping("/pacientes")
    public String pacienteList(Model model) {

        List<Paciente> pacienteList = iPacienteService.findAll();
        model.addAttribute("pacienteList", pacienteList);

        return "pacientes";
    }

    @GetMapping("/pacientes/add")
    public String pacienteAdd(Model model) {
        model.addAttribute("paciente", new Paciente());
        return "pacienteAdd";
    }

    @PostMapping("/pacientes/save")
    public String pacienteSave(Paciente paciente) {
        iPacienteService.create(paciente);
        return "redirect:/pacientes";

    }

    @GetMapping("pacientes/edit/{id}")
    public String pacienteEdit(Model model, @PathVariable Integer id) {
        model.addAttribute("paciente", iPacienteService.findById(id));
        return "pacienteAdd";
    }

    @GetMapping("/pacientes/delete/{id}")
    public String pacienteDelete(Model model, @PathVariable Integer id) {
            iPacienteService.deleteById(id);
        return "redirect:/pacientes";
    }

}
