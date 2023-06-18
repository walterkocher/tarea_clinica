import java.util.ArrayList;

public class Clinica {
	private String nombre;
	private String tipoClinica;
	private ArrayList<String> direccionesAsociadas;
	private ArrayList<Trabajador> trabajadores;
	private ArrayList<EspecialidadMedica> especialidadesMedicas;

	public Clinica(String nombre, String tipoClinica, ArrayList<String> direccionesAsociadas) {
		this.nombre = nombre;
		this.tipoClinica = tipoClinica;
		this.direccionesAsociadas = direccionesAsociadas;
		this.trabajadores = new ArrayList<>();
		this.especialidadesMedicas = new ArrayList<>();
	}
	public ArrayList<EspecialidadMedica> getEspecialidadesMedicas(){
		return this.especialidadesMedicas;
	}
	public ArrayList<Trabajador> getTrabajadores(){
		return this.trabajadores;
	}
	public boolean agregarMedico(Medico medico) {
		for (Trabajador trabajador : this.trabajadores){
			if(trabajador.getNombre().equals(medico.getNombre())){
				return false;
			}
		}
		trabajadores.add(medico);
		return true;
	}
	public boolean agregarAdministrativo(Administrativo administrativo) {
		for (Trabajador trabajador : this.trabajadores){
			if(trabajador.getNombre().equals(administrativo.getNombre())){
				return false;
			}
		}
		trabajadores.add(administrativo);
		return true;
	}
	public boolean agregarEspecialidadMedica(EspecialidadMedica especialidadMedica) {
		for (EspecialidadMedica especialidadMedica1 : this.especialidadesMedicas){
			if(especialidadMedica1.getNombre().equals(especialidadMedica.getNombre())){
				return false;
			}
		}
		especialidadesMedicas.add(especialidadMedica);
		return true;
	}


	public void obtenerMedicos() {
		for(Trabajador trabajador : this.trabajadores){
			if(trabajador.getTipo().equals("MÉDICO")){
				System.out.println(trabajador);
			}
		}
	}

	public void obtenerAdmininstrativos(){
		for(Trabajador trabajador : this.trabajadores){
			if (trabajador.getTipo().equals("ADMINISTRATIVO")){
				System.out.println(trabajador);
			}
		}
	}
	public void obtenerMedicosEspecialidad(EspecialidadMedica especialidadMedica) {
		for(EspecialidadMedica especialidadMedica1 : this.especialidadesMedicas){
			if (especialidadMedica1.equals(especialidadMedica)){
				for (Trabajador trabajador : especialidadMedica.getPersonal()){
					if (trabajador.getTipo().equals("MÉDICO")){
						System.out.println(trabajador);
					}
				}
			}
		}
	}


	public void obtenerAdministrativosEspecialidad(EspecialidadMedica especialidadMedica) {
		for(EspecialidadMedica especialidadMedica1 : this.especialidadesMedicas){
			if (especialidadMedica1.equals(especialidadMedica)){
				System.out.println(especialidadMedica);
			}
		}
	}
	public boolean agregarTrabajadorEspecialidad(Trabajador trabajador, EspecialidadMedica especialidadMedica) {
		for(Trabajador trabajador1 : especialidadMedica.getPersonal()){
			if(trabajador1.equals(trabajador)){
				return false;
			}
		}
		especialidadMedica.getPersonal().add(trabajador);
		return true;
	}
	public boolean mostrarEspecialidad(EspecialidadMedica especialidadMedica){
		for (EspecialidadMedica especialidadMedica1 : this.especialidadesMedicas){
			if (especialidadMedica1.getNombre().equals(especialidadMedica.getNombre())){
				System.out.println(especialidadMedica);
				return true;
			}
		}
		return false;
	}


}