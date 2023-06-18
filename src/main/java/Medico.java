import java.util.ArrayList;

public class Medico extends Trabajador {
	private ArrayList<String> especialidad;
	private ArrayList<String> experienciaPrevia;

	public Medico(String nombre, String tituloProfecional, String rut, String estadoCivil, String direccion, String horarioAtencion, ArrayList<String> especialidad, ArrayList<String> experienciaPrevia) {
		super(nombre, tituloProfecional, rut, estadoCivil, direccion, horarioAtencion);
		this.especialidad = especialidad;
		this.experienciaPrevia = experienciaPrevia;
	}



	public ArrayList<String> getEspecialidad() {
		return this.especialidad;
	}

	public void setEspecialidad(ArrayList<String> especialidad) {
		this.especialidad = especialidad;
	}

	public ArrayList<String> getExperienciaPrevia() {
		return this.experienciaPrevia;
	}

	public void setExperienciaPrevia(ArrayList<String> experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	public String getTipo() {
		return "MÉDICO";
	}
	@Override
	public String toString() {
		return "Nombre: "+getNombre()+"\n Rut: "+getRut()+"\n Título: "+getTituloProfecional()+"\n Cargo: "+getTipo()+"\n Especialidades: "+getEspecialidad()+"\n Experiencias: "+getExperienciaPrevia();
	}
}