package pe.isil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.isil.model.Paciente;
import pe.isil.service.IPacienteService;
import java.util.List;

@Controller
public class PacienteController {

    @Autowired
    IPacienteService iPacienteService;


    @GetMapping("/pacientes")
    public String getPacienteList(Model model) {

        List<Paciente> pacienteList = iPacienteService.findAll();
        model.addAttribute("pacienteList", pacienteList);

        return "paciente-List";
    }

    @GetMapping("/pacientes/add")
    public String addPaciente(Model model) {
        model.addAttribute("paciente", new Paciente());
        return "paciente-add";
    }

    @PostMapping("/pacientes/save")
    public String savePaciente(Model model, Paciente paciente) {
        iPacienteService.create(paciente);
        return "redirect:/pacientes";

    }

    @GetMapping("pacientes/edit/{id}")
    public String pacienteForEdit(@PathVariable Integer idPaciente, Model model){

       Paciente paciente= (Paciente) iPacienteService.findById(idPaciente);

        if(paciente!=null){
            model.addAttribute("paciente",paciente);
        }
        return "paciente/edit";
    }

    @PostMapping("/pacientes/update")
    public String updatePaciente(Model model, Paciente paciente){

        iPacienteService.update(paciente);
        return "redirect:/pacientes";
    }

    public String deletePaciente(@PathVariable Integer idPaciente){
        Paciente paciente = (Paciente) iPacienteService.findById(idPaciente);
        if (paciente!=null){
            iPacienteService.delete(paciente);
        }
        return "redirect:/pacientes";
    }

}
