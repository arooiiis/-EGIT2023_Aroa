
public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;
    
    Persona(String nombre, String apellidos, int edad){
    	this.nombre = nombre;
    	this.apellidos = apellidos;
    	this.edad = edad;
    }
    
    private int cumpleanios() {
    	return this.edad +1;
    }

	public String datosPersona() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}
   
}
