package modificacionFicheros;
import java.io.*;
import java.util.*;
public class ejercicioB7 {

	public static void main(String[] args) {
		
		// tengo que hacerlo para todos pero well...
		File f = new File("Documentos/Libros/lazarillo.txt");
		
		try {
			// creamos el hashmap para las palabras más usadas
			HashMap <String,Integer> contador = new HashMap <String, Integer>();
			// creamos el scanner
			Scanner reader = new Scanner(f);
			// variables:
			int lines=0, words=0, chars=0;

			// bucle:
			while(reader.hasNextLine()) { // si el lector ha encontrado otra linea más...
				lines++; // añade 1 al contador de lineas
				String line = reader.nextLine(); // selecciona la linea
				String[] lineWords = line.split(" "); // separa sus palabras

				for(int i=0; i<lineWords.length; i++) { // recorremos las palabras de esa línea
					words++; // añadimos 1 al contador de palabras.
					// miramos...
					if (!lineWords[i].isEmpty()) { // si la palabra seleccionada no está vacía:
						if (contador.containsKey(lineWords[i])) { // y el contador (HM) tiene esa palabra registrada:
							contador.put(lineWords[i], contador.get(lineWords[i]) + 1); // entonces la añade sumando 1 a su valor.
						} else { // si no:
							contador.put(lineWords[i], 1); // la creamos y inicializamos su valor a 1
						}
						
						//Collections.sort(contador); NO FUNCIONA !!! (NO USAR ESTO);
						
						// aqui contamos los caracteres que hay dentro de cada palabra
						for(char a : lineWords[i].toCharArray()) {
							chars++; // añadimos 1 al contador de caracteres.
						}
					}
					
					// mostramos los resultados por pantalla.
					System.out.println("");
					System.out.println("Cantidad de lineas: "+lines);
					System.out.println("Cantidad de palabras: "+words);
					System.out.println("Cantidad de caracteres: "+chars);
					
					// cerramos el scanner
					reader.close();

				}
			}
			// excepcion si no se ha encontrado el fichero.
		}catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		}
	}
	
}

