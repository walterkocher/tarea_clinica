public abstract class Trabajador {
	private String nombre;
	private String tituloProfecional;
	private String rut;
	private String estadoCivil;
	private String direccion;
	private String horarioAtencion;

	public Trabajador(String nombre, String tituloProfecional, String rut, String estadoCivil, String direccion, String horarioAtencion) {
		this.nombre = nombre;
		this.tituloProfecional = tituloProfecional;
		this.rut = rut;
		this.estadoCivil = estadoCivil;
		this.direccion = direccion;
		this.horarioAtencion = horarioAtencion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getTituloProfecional() {
		return this.tituloProfecional;
	}

	public String getRut() {
		return this.rut;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getHorarioAtencion() {
		return this.horarioAtencion;
	}

	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

	public abstract String getTipo();
}