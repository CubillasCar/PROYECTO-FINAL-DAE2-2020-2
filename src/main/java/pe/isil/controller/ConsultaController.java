package pe.isil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pe.isil.model.Consulta;
import pe.isil.service.ConsultaService;
import pe.isil.service.EspecialidadService;
import pe.isil.service.MedicoService;
import pe.isil.service.PacienteService;

@Controller
public class ConsultaController {

    private final ConsultaService consultaService;
    private final PacienteService pacienteService;
    private final MedicoService medicoService;
    private final EspecialidadService especialidadService;


    public ConsultaController(ConsultaService consultaService, PacienteService pacienteService, MedicoService medicoService, EspecialidadService especialidadService) {
        this.consultaService = consultaService;
        this.pacienteService = pacienteService;
        this.medicoService = medicoService;
        this.especialidadService = especialidadService;
    }

    @GetMapping("/consultas")
    public String consultaList(Model model){
        model.addAttribute("consultas", consultaService.findAll());
        return "consultas";
    }

    @GetMapping("/consultas/add")
    public String consultaAdd(Model model){
        model.addAttribute("consulta", new Consulta());
        model.addAttribute("pacientes", pacienteService.findAll());
        model.addAttribute("medicos", medicoService.findAll());
        model.addAttribute("especialidades", especialidadService.findAll());

        return "consultaAdd";
    }

    @PostMapping("/consultas/save")
    public String consultaSave(Consulta consulta){
        consultaService.createOrUpdate(consulta);
        return "redirect:/consultas";

    }

    @GetMapping("/consultas/edi/{id}")
    public String consultaEdit(Model model, @PathVariable Integer id){
        model.addAttribute("consulta", consultaService.findById(id));
        model.addAttribute("pacientes", pacienteService.findAll());
        model.addAttribute("medicos", medicoService.findAll());
        model.addAttribute("especialidades", especialidadService.findAll());

        return "consultaAdd";
    }

    @GetMapping("/consultas/delete/{id}")
    public String consultaDelete(Model model, @PathVariable Integer id){
        consultaService.deleteById(id);
        return "redirect:/consultasAdd";
    }
}
