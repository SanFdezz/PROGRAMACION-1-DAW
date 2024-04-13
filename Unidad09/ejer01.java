package herencia;

public class ejer01 {

	public static void main(String[] args) {
		
		Persona a = new Persona("Sandra", 18);
		a.mostrar();
		Alumno b = new Alumno("Pepe", 34, 2.86);
		b.mostrar();
		Alumno c = new Alumno("Perico", 54);
		c.mostrar();
	}

}

class Persona {
	
	String nombre = "";
	int edad = 0;
	
	public Persona (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void mostrar() {
		System.out.println("Nombre: "+this.nombre+" Edad: "+edad+" años.");
	}
	
	
}

class Alumno extends Persona{
	
	double media;
	
	public Alumno(String nombre, int edad) {
		super(nombre,edad);
	}
	// sobrecarga del constructor
	public Alumno(String nombre, int edad, double media) {
		super(nombre,edad);
		this.media = media;
	}
	
	
	
}









