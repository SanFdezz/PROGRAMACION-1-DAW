package modificacionFicheros;
import java.util.*;
import java.io.*;
public class ejercicioB5 {

	public static void main(String[] args) {

		// creamos la carpeta "Diccionario" en el espacio de trabajo.
		File dictionary = new File("Diccionario");
		dictionary.mkdir(); // creamos la carpeta
		
		// instanciamos las variables
		char letter;
		String fileName, firstLetter, word;
		
		// bucle que recorre todas las letras del abecedario con el codigo ascii
		for(int i=97; i<123; i++) {
			letter=(char)i; // convertimos el ascii a un caracter
			fileName = Character.toString(letter); // ese caracter lo pasamos a String
			File file = new File(dictionary, fileName+".txt"); // instanciamos ese nuevo archivo a crear como la letra + .txt
			try {
				FileWriter writer = new FileWriter(file); // creamos el escritor
				// creamos un scanner de lectura
				File toRead = new File("Documentos/diccionario.txt");
				Scanner reader = new Scanner(toRead);
				
				// bucle que recorra todo el archivo del diccionario
				while(reader.hasNextLine()) {
					word = reader.nextLine(); // se guarda la palabra
					firstLetter = word.substring(0,1); // se queda con la primera letra
					if(firstLetter.equals(fileName)) { // si esa primera letra es la que busca:
						writer.write(word+"\n"); // escribe la palabra junto con un salto de línea
					}
				}
				writer.close(); // cierra el escritor
				reader.close(); // cierra el lector
				System.out.println("Creados con éxito."); //mostramos esto al acabar.
				
			} catch (IOException e) {
				System.out.println("Error al crear el archivo: " + e.getMessage()); // excepcion si hay un error al crear el escritor
			}
			
		}

	}		

}
