package pe.isil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.isil.model.Especialidad;
import pe.isil.model.Medico;
import pe.isil.model.Paciente;
import pe.isil.repository.EspecialidadRepo;
import pe.isil.repository.IPacienteRepo;
import pe.isil.repository.MedicoRepo;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProyectoFinalDae2Application implements CommandLineRunner {

    @Autowired
    private IPacienteRepo iPacienteRepo;
    @Autowired
    private MedicoRepo medicoRepo;
    @Autowired
    private EspecialidadRepo especialidadRepo;

    public static void main(String[] args) {
        SpringApplication.run(ProyectoFinalDae2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        List<Paciente> pacienteList = new ArrayList<>();
        pacienteList.add(new Paciente(null, "Carlos", "Cubillas Olano", "71012694", "Av Siempre viva", "989819203", "ccubillas@gmail.com", null));
		pacienteList.add(new Paciente(null, "Juan", "Sano Onosano", "41042634", "Av Siempre viva", "989819203", "ccubillas@gmail.com", null));
		pacienteList.add(new Paciente(null, "Jordi", "Polo ", "41011691", "Av Siempre viva", "989819203", "ccubillas@gmail.com", null));
		pacienteList.add(new Paciente(null, "Luis", "Muerto Perofeliz", "51612393", "Av Siempre viva", "989819203", "ccubillas@gmail.com", null));


		iPacienteRepo.saveAll(pacienteList);

        List<Medico> medicoList = new ArrayList<>();
        medicoList.add(new Medico(null, "Oscar","Mataheridos","1002","foto1",null));
		medicoList.add(new Medico(null, "Ruben","Heridesanos","2001","foto2",null));
		medicoList.add(new Medico(null, "José","Sanamuertos","3005","foto2",null));
        medicoRepo.saveAll(medicoList);

		List<Especialidad> especialidadList = new ArrayList<>();
		especialidadList.add(new Especialidad(null, "Cardiologia","Corazon, ella no te ama",null));
		especialidadList.add(new Especialidad(null, "Neumologia","Pulmones, Asmo, bronsquios",null));
		especialidadList.add(new Especialidad(null, "Gastrologia","Sistema Digestivo, estomoga, pancreas",null));
		especialidadList.add(new Especialidad(null, "Neurologia","Sistema nervioso, ",null));
		especialidadRepo.saveAll(especialidadList);

    }
}
