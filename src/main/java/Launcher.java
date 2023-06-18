import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        inicializar();
    }
    public static void inicializar(){
        ArrayList<String> direcciones = new ArrayList<>();
        direcciones.add("Temuco");
        direcciones.add("Angol");

        Clinica clinica = new Clinica("Clínica Alemana", "Privada",direcciones);
        //Creando administrativos en la clinica
        Administrativo administrativo = new Administrativo("José","Administracion","14.563.456.3", "Casado", "Las quilas 654","Horario Administrativo","jose@calemana.cl");
        clinica.agregarAdministrativo(administrativo);

        //Creando medicos en la clinica
        ArrayList<String> especialidades = new ArrayList<>();
        especialidades.add("Pediatría");
        ArrayList<String> experiencia = new ArrayList<>();
        experiencia.add("8 años en Pediatría");
        Medico medico = new Medico("Raúl","Licenciado en medicina","16.986.467-7","Casado","Pablo Nerruda 556","8 am a 13 pm", especialidades, experiencia);
        clinica.agregarMedico(medico);

        //Creando una especialidad dentro de la clinica
        EspecialidadMedica especialidadMedica = new EspecialidadMedica("Pediatria", "Temuco", clinica.getTrabajadores());
        clinica.agregarTrabajadorEspecialidad(administrativo, especialidadMedica);
        clinica.agregarTrabajadorEspecialidad(medico, especialidadMedica);

        clinica.obtenerMedicos();
        clinica.obtenerAdmininstrativos();

    }
}
