package evaluable;
import java.util.*;
public class ListaForbes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // creamos scanner
		ArrayList<String> lista = new ArrayList<String>(); // creamos el arrayList
		// creamos las variables
		int numRevista, numPasta, cont=0;
		String nombreRico; 
		boolean nombreCorrecto, pastaCorrecta;

		System.out.println("Introduzca el número de la revista:"); // pedimos num de revista
		numRevista=sc.nextInt(); // guardamos el dato
		sc.nextLine(); // para limpiar el buffer

		do { // bi¡ucle hasta confirmar que el valor introducido es mayor o igual a 2000
			if(numRevista<2000) {
				System.out.println("Ya se han publicado todos los números hasta el 2000, por favor, introduzca un número superior al mencionado:");
				numRevista=sc.nextInt(); // si no lo es, lo pedimos otra vez
				sc.nextLine();
			} 
		}while(numRevista<2000);


		do { // bucle hasta que el usuario introduzca "SALIR"
			System.out.println("Introduzca el nombre de rico para la revista "+numRevista); // pedimos nombre
			nombreRico=sc.nextLine(); // lo guardamos
			if(nombreRico.equalsIgnoreCase("salir")) { // comprobamos que no sea la condicion de salida
				break; // si lo es, se acaba el bucle
			} 
			System.out.println("Introduzca dinero que dice tener "+nombreRico); // pedimos dinero
			numPasta=sc.nextInt(); // guardamos dinero
			sc.nextLine(); // limpiamos el buffer
			
			// realizamos la distinción de si son valido o no
			nombreCorrecto= decidir_nombre_rico(nombreRico); 
			pastaCorrecta= decidir_pasta_rico(numPasta);
			
			if(!nombreCorrecto) { // si el nombre es incorrecto, mostramos el texto por pantalla
				System.out.println(nombreRico+" no es nombre de rico, le faltan vocales.");
			} else if(!pastaCorrecta) { // si el dinero es insuficiente, mostramos el texto por pantalla
				System.out.println(nombreRico+" es muy pobre y no puede aparecer en Forbes!");
			} else { // si no, añadimos el nombre al arrayList y mostamos en que posición está con un contador (ya que no se va a eliminar ninguna pos)
				lista.add(nombreRico);
				cont++;
				System.out.println(nombreRico+" insertado en el Arraylist de forbes en la posición "+cont);
			}
			
		}while(true);

		System.out.println("Los ricos introducidos son los siguientes:"); // mostramos la lista
		for (String rico : lista) { // la recorremos con un ForEach elemento a elemento
			System.out.println(rico);
		}
		
		sc.close(); // cerramos el scanner
	}
	// creamos un  método para detectar si el nombre es válido o no
	public static boolean decidir_nombre_rico(String nombre_rico) {

		if(nombre_rico.contains("e")&& nombre_rico.contains("o")) { // si el nombre contiene una e y una o minimo, devolvemos true
			return true;
		} else { // si no, devolvemos false
			return false;
		}
		
	}
	// creamos un  método para detectar si el dinero introducido es válido o no
	public static boolean decidir_pasta_rico(int pasta_rico) {
		
		if(pasta_rico<6000) { // si el dinero es menor a 6000, devolvemos false
			return false;
		} else { // y si es mayor o igual, true
			return true;
		}
		
		
	}

}
