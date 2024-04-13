package ejerciciosBasicos;
import java.util.*;
public class Ejercicio12 {

	public static void main(String[] args) {
		
		ArrayList <String> listaUno = new ArrayList<String>();
		
		listaUno.add("Lunes");
		listaUno.add("Martes");
		listaUno.add("Miercoles");
		listaUno.add("Jueves");
		listaUno.add("Viernes");
		listaUno.add("Sabado");
		listaUno.add("Domingo");
		
		System.out.println("Normal:");
		System.out.println(listaUno);
		
		List<String> porcion = listaUno.subList(0,5);
		
		System.out.println("Seccionada:");
		System.out.println(porcion);
		

	}

}
