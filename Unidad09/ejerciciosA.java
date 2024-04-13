package herencia;
import java.util.*;
public class ejerciciosA {

	public static void main(String[] args) {
		
		
		
		
		

	}
	
	public class Persona {
		
		String nombre;
		String apellidos;
		String fechaNacim;
		
		public Persona(String n, String a, String f) {
			
			nombre = n;
			apellidos = a;
			fechaNacim = f;
			
		}
	}
	
	public class Profesor extends Persona{
		
		public Profesor(String n, String a, String f) {
			super(n,a,f);
			
		}
		
	}
	
	public class Alumno extends Profesor{
		
		public Alumno(String n, String a, String f) {
			super(n,a,f);
			
		}
		
	}
	
}


