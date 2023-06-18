public class Administrativo extends Trabajador {
	private String correoElectronico;

	public Administrativo(String nombre, String tituloProfecional, String rut, String estadoCivil, String direccion, String horarioAtencion, String correoelectronico) {
		super(nombre,tituloProfecional,rut,estadoCivil,direccion,horarioAtencion);
		this.correoElectronico = correoelectronico;
	}

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getTipo() {
		return "ADMINISTRATIVO";
	}
	@Override
	public String toString() {
		return "Nombre: "+getNombre()+"\n Rut: "+getRut()+"\n Título: "+getTituloProfecional()+"\n Cargo: "+getTipo()+"\n Correo: "+getCorreoElectronico();
	}
}