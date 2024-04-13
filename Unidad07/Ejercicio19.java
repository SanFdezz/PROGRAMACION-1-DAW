package ejerciciosBasicos;
import java.util.*;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		ArrayList <String> listaUno = new ArrayList<String>();
		
		listaUno.add("Lunes");
		listaUno.add("Martes");
		listaUno.add("Miercoles");
		listaUno.add("Jueves");
		listaUno.add("Viernes");
		
		listaUno.trimToSize(); // Reduce la capacidad del ArrayList al número actual de elementos

	}

}
