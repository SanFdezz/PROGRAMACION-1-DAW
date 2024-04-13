package queue;
import java.util.*;
public class ColaCine {

	public static void main(String[] args) {
		
		Queue <String> cola = new LinkedList<String>(); // creamos la cola
		
		Scanner sc = new Scanner(System.in); // creamos scanner
		String nombre=""; //inicializamos variables
		int numPersonas; // creamos variables
		
		
		do { // bucle principal del programa:
			System.out.println("Introduzca nombres para ENTRAR separados por '@', 'nadie' o 'salir' para finalizar el programa: ");
			nombre=sc.nextLine(); // leemos los nombres.
			
			if (nombre.equalsIgnoreCase("salir")) { // hay q poner la salida antes del resto xq si no, no sale
				break; // rompemos el bucle
			} else if(!nombre.equalsIgnoreCase("nadie")) { // si el nombre es diferente de "nadie", pues los añadimos al queue
				String[] anyadidos = nombre.split("@"); // separamos los nombres por el @ y los añadimos en un array simple
				for(String e : anyadidos) { // con un forEach añadimos esos nombres a la cola.
					cola.add(e);
				}
			} else { // si el nombre == "nadie" decimos que efectivamente nadie ha entrado
				System.out.println("No ha entrado nadie");
			}
			
			System.out.println("Estado de la cola después de ENTRAR:"); // mostramos la cola en orden de llegada
			for(String e : cola) {
				System.out.println(e); // el forEach para recorrer el queue
			}
			
			do { // bucle que rompe cuando el num introducido es MENOR a el size del queue
				System.out.println("Introduzca número de personas para SALIR de la cola:");
				numPersonas=sc.nextInt(); // leemos el num de elementos a borrar
				sc.nextLine(); // limpiamos el buffer
				if (numPersonas>cola.size()) { // si hay más personas para borrar q las q hay en cola, mostrar eso:
					System.out.println("No pueden salir "+numPersonas+" si solo hay "+cola.size()+" en la cola.");
				} else { // si no, borramos la cantidad de personas q nos indican con un FOR.
					for(int i=0; i<numPersonas; i++) {
						System.out.println("Se sale de la cola: "+cola.remove()); // mostramos cual sale de la cola
						 // borramos el elemento
					}
				}
			} while(numPersonas>cola.size()); // condicion de salida 1
			
		}while(true); // condición de salida 2 (aunq en vd está puesta dentro del DO en el BREAK)
		
		sc.close();
		
		
 
	}

}
