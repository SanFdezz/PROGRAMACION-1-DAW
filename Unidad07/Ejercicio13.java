package ejerciciosBasicos;
import java.util.*;
public class Ejercicio13 {

	public static void main(String[] args) {
		
		ArrayList <String> listaUno = new ArrayList<String>();
		ArrayList <String> listaDos = new ArrayList<String>();
		
		listaUno.add("Lunes");
		listaUno.add("Martes");
		listaUno.add("Miercoles");
		listaUno.add("Jueves");
		listaUno.add("Viernes");
		
		listaDos.add("1");
		listaDos.add("2");
		listaDos.add("3");
		listaDos.add("4");
		listaDos.add("5");
		
		boolean igual = listaUno.equals(listaDos);
		if (igual == true) System.out.println("Son iguales");
		else System.out.println("Son diferentes");
		
		//rehacer   con el forEach
	}

}
