package ejerciciosBasicos;
import java.util.*;
public class Ejercicio14 {

	public static void main(String[] args) {
		
		ArrayList <String> listaUno = new ArrayList<String>();
		
		listaUno.add("Lunes");
		listaUno.add("Martes");
		listaUno.add("Miercoles");
		listaUno.add("Jueves");
		listaUno.add("Viernes");
		
		System.out.println("Lista uno original:");
		System.out.println(listaUno);
		
		Collections.swap(listaUno, 2, 4);
		
		System.out.println("Lista cambiada:");
		System.out.println(listaUno);
		

	}

}
