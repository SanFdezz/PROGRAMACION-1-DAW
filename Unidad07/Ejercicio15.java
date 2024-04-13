package ejerciciosBasicos;
import java.util.*;
public class Ejercicio15 {

	public static void main(String[] args) {
		
		ArrayList <String> listaUno = new ArrayList<String>();
		ArrayList <String> listaDos = new ArrayList<String>();
		
		listaUno.add("Lunes");
		listaUno.add("Martes");
		listaUno.add("Miercoles");
		listaUno.add("Jueves");
		listaUno.add("Viernes");
		
		System.out.println("Primera lista:");
		System.out.println(listaUno);
		
		listaDos.add("1");
		listaDos.add("2");
		listaDos.add("3");
		listaDos.add("4");
		listaDos.add("5");
		
		System.out.println("Segunda lista:");
		System.out.println(listaDos);
		
		ArrayList <String> copia = new ArrayList<String>();
		
		copia.addAll(listaUno);
		copia.addAll(listaDos);
		
		System.out.println("Combinadas:");
		System.out.println(copia);
		
		
		
		

	}

}
