import java.util.ArrayList;

public class EspecialidadMedica {
	private String nombre;
	private String ubicacion;
	private ArrayList<Trabajador> personal;
	public EspecialidadMedica(String nombre, String ubicacion, ArrayList<Trabajador> personal){
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.personal = personal;
	}
	public ArrayList<Trabajador> getPersonal(){
		return this.personal;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String toString() {
		return "\nNombre: "+getNombre()+"\nUbicación: "+getUbicacion()+"\nEmpleados: "+getPersonal()+ "\n";
	}
}