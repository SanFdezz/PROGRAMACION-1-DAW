package ejerciciosBasicos;
import java.util.*;
public class Ejercicio16 {

	public static void main(String[] args) {
		
		ArrayList <String> listaUno = new ArrayList<String>();
		
		listaUno.add("Lunes");
		listaUno.add("Martes");
		listaUno.add("Miercoles");
		listaUno.add("Jueves");
		listaUno.add("Viernes");
		
		System.out.println("Primera lista:");
		System.out.println(listaUno);
		
		ArrayList<String> clonada = (ArrayList<String>) listaUno.clone();
		
		System.out.println("Esta es la lista clonada:");
		System.out.println(clonada);
		

	}

}

