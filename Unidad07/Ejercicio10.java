package ejerciciosBasicos;
import java.util.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		
		ArrayList <String> listaUno = new ArrayList<String>();
		
		listaUno.add("Lunes");
		listaUno.add("Martes");
		listaUno.add("Miercoles");
		listaUno.add("Jueves");
		listaUno.add("Viernes");
		
		System.out.println("Sin desordenar:");
		System.out.println(listaUno);
		
		// con el shuffle barajamos las posiciones en el ArrayList
		Collections.shuffle(listaUno);
		
		System.out.println("Desordenada:");
		System.out.println(listaUno);

	}

}
