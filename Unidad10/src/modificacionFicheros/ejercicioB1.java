package modificacionFicheros;
import java.util.*;
import java.io.*;
public class ejercicioB1 {

	public static void main(String[] args) {
		int num; // creamos una variable.
		// creamos un scanner que permita leer archivos.
		File f = new File("/Users/spara/eclipse-workspace/Unidad10/Documentos/numeros.txt"); // archivo a recorrer
		try {
			Scanner lect = new Scanner(f); // creamos el scanner
			int maximo = Integer.MIN_VALUE; // inicializamos el maximo como el mun más pequeño que hay, para q no haya problemas
			int minimo = Integer.MAX_VALUE; // y viceversa
			
			while(lect.hasNextInt()) { // mientras haya un entero más que leer:
				num=lect.nextInt(); // lo guardamos en una variable
				if(num > maximo) { // si es más grande que el maximo
					maximo = num; // lo guardamos como el.
				} 
				if (num < minimo) { // y si es más pequeño que el minimo
					minimo = num; // lo guardamos como el
				}
			}
			// mostramos los resultados al final.
			System.out.println("El numero más alto es: "+maximo+". Y el numero más bajo es: "+minimo);
			
		} catch (FileNotFoundException e) { // si detecta la excepción de que no está el archivo indicado:
			System.out.println("No se ha encontrado el archivo."); // muestra el mensaje.
		}
	}

}
