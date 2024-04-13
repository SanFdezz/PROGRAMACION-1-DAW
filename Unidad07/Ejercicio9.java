package ejerciciosBasicos;

import java.util.*;
public class Ejercicio9 {

	public static void main(String[] args) {
		
		ArrayList <String> listaUno = new ArrayList<String>(5);
		ArrayList <String> listaDos = new ArrayList<String>(listaUno.size());
		
		listaUno.add("Lunes");
		listaUno.add("Martes");
		listaUno.add("Miercoles");
		listaUno.add("Jueves");
		listaUno.add("Viernes");
		
		System.out.println("Lista 1:");
		System.out.println(listaUno);
		
		listaDos.add("1");
		listaDos.add("2");
		listaDos.add("3");
		listaDos.add("4");
		listaDos.add("5");
		
		System.out.println("Lista 2:");
		System.out.println(listaDos);
		
		Collections.copy(listaDos, listaUno);
		System.out.println("Lista 1:");
		System.out.println(listaUno);
		System.out.println("Lista 2:");
		System.out.println(listaDos);
		
		// preguntar xq no me sale !!!
		
		
	}

}