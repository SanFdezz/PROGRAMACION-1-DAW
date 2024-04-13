package ejerciciosBasicos;
import java.util.*;
public class eurovision {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // creo el scanner
		
		// creo e inicializo (algunas) las variables.
		String buscar, pais, ganador="";
		int votos,maxVotos=0;
		
		// creo el map
		HashMap <String,Integer> concurso = new HashMap <String,Integer>();
		
		// creo un do while(true) para poderle dar yo una condición de salida al bucle.
		/* en este bucle se piden minimo 3 paises y se le asignan un num de votos a cada uno,
		   y cuando el usuario introduce x consola "salir", el programa sale del blucle y muestra cual
		   es el pais ganador y su cantidad de votos.*/
		
		System.out.println("¡Bienvenid@ al festival de Eurovisión!");
		do {
			System.out.println("Introduce el nombre del pais concursante:");
			pais=sc.nextLine();
			
			// con esta condición miramos sin lo introducido es una condición de salida, y si lo es, si es válida o no.
			
			if(pais.equalsIgnoreCase("salir") && concurso.size()>=3) { 
				break; // salimos del bucle cuando todas las condiciones se cumplen.
			} else if (pais.equalsIgnoreCase("salir") && concurso.size()<3) {
				System.out.println("No se puede realizar el concurso con menos de 3 paises.");
				System.out.println("Introduce el nombre del pais concursante:");
				pais=sc.nextLine();
			}
			
			// aleatorizamos los votos de los paises y nos almacenamos los valores del ganador.
			
			votos=(int)(Math.random()*12+1);		
			if(votos>maxVotos) {
				maxVotos=votos;
				ganador=pais;
			}
			
			// guardamos los datos del pais en el HashMap
			concurso.put(pais,votos);		
			
		}while(true);
		
		// mostramos el pais ganador
		System.out.println("Con las puntuaciones repartidas, el país ganador es: "+ganador+" con una puntuación de: "+maxVotos+" votos.");
		
		/* creamos otro do while(true) para crear una condición de salida más personalizada, en este caso, se podrá salir siempre del 
		   bucle mientras se escriba bien la palabra salir (independientemente de las mayusculas o minusculas) y si el usuario introduce
		   un pais para buscar su puntuación y ese pais no ha concursado, le aparecerá un texto diciendo eso, que no formaba parte del mismo.*/
		
		do {
			System.out.println("Introduzca un país para saber su puntuación:");
			buscar=sc.nextLine();
			if(concurso.containsKey(buscar)) {
				System.out.println(buscar+" ha obtenido un total de "+concurso.get(buscar)+" votos.");
			} else if (buscar.equalsIgnoreCase("salir")){
				System.out.println("Gracias por consultar Eurovisión.");
				break; // rompemos el bucle cuando el "pais" introducido ha sido "salir".
			} else {System.out.println("El país introducido no ha participado en el concurso.");}
			
		} while(true);
		
	}

}
