package modificacionFicheros;
import java.io.*;
import java.util.*;
public class ejercicioB6 {

	public static void main(String[] args) {
		
		// creamos el escaner de teclado
		Scanner kbd = new Scanner(System.in);
		
		// pedimos un número del tamaño que sea para buscarlo.
		System.out.println("Introduzca un entero de cualquier longitud:");
		String number = kbd.nextLine(); // lo guardo en un String para poder usar ".contains()".
		
		File pi = new File("Documentos/pi-million.txt"); // instanciamos el lector
		try {
			// creamos el lector
			Scanner reader = new Scanner(pi);
			
			// instanciamos las variables;
			String actual;
			boolean founded = false;
			
			// bucle para leer el archivo
			while(reader.hasNextLine()) {
				// buscamos si en la linea que esta recorriendo se encuentra el numero deseado
				actual=reader.nextLine();
				if(actual.contains(number)) {
					founded= true; // si lo encuentra, el booleano cambia a true
				}
			}
			
			if(founded) { // si lo ha encontrado:
				System.out.println("El número si se encuentra en el primer millon de decimales de pi.");
			} else { // si no:
				System.out.println("El número no se encuentra en el primer millon de decimales de pi.");
			}
			
			// cerramos los scanners.
			reader.close();
			kbd.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo.");
		}
		
	}

}
