package ejerciciosBasicos;
import java.util.*;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		ArrayList <String> listaUno = new ArrayList<String>();
		
		listaUno.add("Lunes");
		listaUno.add("Martes");
		listaUno.add("Miercoles");
		listaUno.add("Jueves");
		listaUno.add("Viernes");
		
		System.out.println("Normal:");
		System.out.println(listaUno);
		
		Collections.reverse(listaUno);
		// es para invertir el orden del ArrayList
		
		System.out.println("Invertida:");
		System.out.println(listaUno);

	}

}
