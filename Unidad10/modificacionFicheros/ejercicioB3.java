package modificacionFicheros;
import java.io.*;
import java.util.*;
public class ejercicioB3 {

	public static void main(String[] args) {

		Scanner kbd = new Scanner(System.in);

		System.out.println("Introduzca el nombre del archivo a leer:");
		String read = kbd.nextLine();
		File readFile = new File(read); // instanciamos el file
		System.out.println("Introduzca el nombre del archivo a escribir:");
		String write = kbd.nextLine();
		kbd.close();
		try {
			FileWriter writer = new FileWriter(new File(write));
			
			try {
				Scanner reader = new Scanner(readFile);
				ArrayList<String> toWrite = new ArrayList<String>();

				while (reader.hasNextLine()) {
                    String line = reader.nextLine();
                    toWrite.add(line);
                }
				System.out.println(toWrite);
				Collections.sort(toWrite);
				System.out.println(toWrite);
				
				for (String line : toWrite) {
                    writer.write(line);
                    writer.write("\n");
                }
				
				reader.close();
				writer.close();
			} catch (FileNotFoundException e) {
				System.out.println("El archivo no existe.");
			}
			
		} catch (IOException e) {
			System.out.println("Ha habido un error.");
		}
		
		// cuando voy a introducir el archivo a leer, tengo que poner la ruta completa si no se encuentra en el directorio de trabajo.
		
	}

}
