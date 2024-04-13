package ejerciciosBasicos;
import java.util.*;
public class Ejercicio18 {

	public static void main(String[] args) {
		
		ArrayList <String> listaUno = new ArrayList<String>();
		
		listaUno.add("Lunes");
		listaUno.add("Martes");
		listaUno.add("Miercoles");
		listaUno.add("Jueves");
		listaUno.add("Viernes");
		
		System.out.println("Lista:");
		System.out.println(listaUno);
		
		System.out.println("¿Está vacía?");
		boolean vacia = listaUno.isEmpty();
		if (vacia==true) System.out.println("Si, está vacía.");
		else System.out.println("No, no lo está.");

	}

}
