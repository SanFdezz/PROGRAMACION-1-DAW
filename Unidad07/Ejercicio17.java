package ejerciciosBasicos;

import java.util.ArrayList;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		ArrayList <String> listaUno = new ArrayList<String>();
		
		listaUno.add("Lunes");
		listaUno.add("Martes");
		listaUno.add("Miercoles");
		listaUno.add("Jueves");
		listaUno.add("Viernes");
		
		System.out.println("La lista rellena:");
		System.out.println(listaUno);
		
		listaUno.clear(); // o listaUno.removeAll();
		
		System.out.println("La lista vaciada:");
		System.out.println(listaUno);
		

	}

}
