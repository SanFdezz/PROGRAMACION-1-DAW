package clasesAbstractas;

public class Mascotas {

	public static void main(String[] args) {
		
		perro p1 = new perro("Toby", 3, false);
		gato g1 = new gato("Neko", 5, "naranja");
		canario c1 = new canario("Piolín", 2, true);
		
		// mostramos info
		String Info1=p1.toString();
		System.out.println(Info1);
		Info1=g1.toString();
		System.out.println(Info1);
		Info1=c1.toString();
		System.out.println(Info1);
		// cumplen años
		p1.cumpleanyos();
		g1.cumpleanyos();
		c1.cumpleanyos();
		// hablan
		p1.habla();
		g1.habla();
		c1.habla();

	}

}

abstract class mascota{
	
	
	protected String nombre;
	protected int edad;
	
	public mascota(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	@Override
	public abstract String toString();
	public abstract void habla();
	
	public void cumpleanyos() {
		this.edad +=1;
		System.out.println("El animal ha cumplido 1 año, ahora tiene "+edad+" años.");
	}
	
	
}

class perro extends mascota{
	
	protected boolean pulgas;
	
	public perro(String nombre, int edad, boolean pulgas) {
		super(nombre,edad);
		this.pulgas = pulgas;
	}
	
	public String toString() {
		return "Nombre del perro: "+nombre+". Edad del perro: "+edad+". ¿Tiene pulgas? "+pulgas;
	}
	
	public void habla() {
		System.out.println("Guau guau");
	}
}

class gato extends mascota{
	
	protected String color;
	
	public gato(String nombre, int edad, String color) {
		super(nombre,edad);
		this.color = color;
	}
	
	public String toString() {
		return "Nombre del gato: "+nombre+". Edad del gato: "+edad+". Color del gato: "+color;
	}
	
	public void habla() {
		System.out.println("Miau miau");
	}
}

class canario extends mascota{
	
	protected boolean volando;
	
	public canario(String nombre, int edad, boolean volando) {
		super(nombre,edad);
		this.volando = volando;
	}
	
	public String toString() {
		return "Nombre del canario: "+nombre+". Edad del canario: "+edad+". ¿Está volando? "+volando;
	}
	
	public void habla() {
		System.out.println("Pio pio");
	}
	
	@Override
	public void cumpleanyos() {
		this.edad +=2;
		System.out.println("El canario ha cumplido 2 años, ahora tiene "+edad+" años.");
	}
}







