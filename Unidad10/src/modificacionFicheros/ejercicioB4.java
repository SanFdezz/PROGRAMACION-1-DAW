package modificacionFicheros;
import java.io.*;
import java.util.*;
public class ejercicioB4 {

	public static void main(String[] args) {
		
		// creamos el scanner de lectura de teclado.
		Scanner kbd = new Scanner(System.in);
		
		try {
			File names = new File("Documentos/usa_nombres.txt"); // instanciamos el archivo
		Scanner nameReader = new Scanner(names); // creamos el lectorNombres
		File surnames = new File("Documentos/usa_apellidos.txt"); // instanciamos los apellidos
		Scanner surnameReader = new Scanner(surnames); // creamos el lectorApellidos
		
		// pedimos la cantidad de veces a realizar.
		System.out.println("Introduzca la cantidad de nombres a generar:");
		int nNames = kbd.nextInt();
		kbd.nextLine(); // limpiamos el buffer
		
		// pedimos el archivo en el cual introducir los nombres
		System.out.println("Introduzca la ruta del archivo en la cual añadirlos:");
		String file = kbd.nextLine();
		
		// instanciamos el archivo y creamos el "escritor".
		File toWrite = new File(file);
		FileWriter writer = new FileWriter(toWrite);
		
		// creamos las listas con todos los nombres y los apellidos
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> surnList = new ArrayList<String>();
		
		// rellenamos la lista de nombres
		while (nameReader.hasNextLine()) {
            String name = nameReader.nextLine();
            nameList.add(name);
        }
		
		// rellenamos la lista de apellidos.
		while (surnameReader.hasNextLine()) {
            String surname = surnameReader.nextLine();
            surnList.add(surname);
        }
		
		//nameList.toArray();
		
		// variables que voy a utilizar en el bucle.
		int nRandom, sRandom, nSize, sSize;
		String finalName;
		
		// creamos un bucle de N iteraciones:
		for(int i=0; i<nNames; i++) {
			
			nSize=(int)(nameList.size()); // tamaño de la lista de nombres
			nRandom = (int) (Math.random() * nSize); // nombre random
			sSize=(int)(nameList.size()); // tamaño de la lista de apellidos
			sRandom = (int) (Math.random() * sSize); // apellido random 
			
			// creamos el nombre y lo guardamos en un String
			finalName = nameList.get(nRandom)+" "+surnList.get(sRandom);
			
			// escribimos el nombre en el archivo
			writer.write(finalName+"\n");
		}
		
		// cerramos todos los scanners.
		kbd.close();
		nameReader.close();
		surnameReader.close();
		writer.close();
		
		} catch (FileNotFoundException e) {
			System.out.println("El fichero de lectura no existe.");
		} catch (IOException e) {
			System.out.println("Error de escritura.");
		}

	}

}
