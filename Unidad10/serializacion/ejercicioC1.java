package serializacion;
import java.io.*;
import java.util.*;
public class ejercicioC1 {

	public static void main(String[] args) {
		
		// instanciamos la ruta del archivo a escribir.
		File file = new File("src/serializacion/MejoresAmigos.txt");
		
		// comenzamos la escritura de un archivo que guarda objetos
		try {
			FileOutputStream exitFile = new FileOutputStream(file); // creamos un archivo de salida (contenido del fichero)
			ObjectOutputStream exitObject = new ObjectOutputStream(exitFile); // creamos un objeto de salida (escribe ficheros)
			// creamos los objetos "MejorAmigo"
			MejorAmigo friend1 = new MejorAmigo("Paula",80);
			MejorAmigo friend2 = new MejorAmigo("Blanca",99);
			// escribimos en el archivo instanciado fuera del catch, los objetos creados.
			exitObject.writeObject(friend1);
			exitObject.writeObject(friend2);
			// cerramos los Scanners
			exitFile.close();
			exitObject.close();

		}catch(IOException e) {
			e.printStackTrace(); // mostramos error si se capta alguno.
		}
		
		// comenzamos la lectura de un archivo que guarda objetos.
		try {
			FileInputStream fileReader = new FileInputStream(file);
			ObjectInputStream objectReader = new ObjectInputStream(fileReader);
			
			try {
				while(true) {
					MejorAmigo bff_desserialized = (MejorAmigo)objectReader.readObject();
					System.out.println("Se ha encontrado al mejor amigo: "+bff_desserialized.getNombre()+" y se ha obtenido el nivel de confianza: "+bff_desserialized.getNivelConfianza());
				}
			}catch(EOFException e) {
				System.out.println("Todos los amigos han sido leidos.");
			}
			
			
			objectReader.close();
			
			
		} catch(IOException | ClassNotFoundException e) {
			e.printStackTrace(); // mostramos error si se capta alguno.
		}
		
	}

}

// creamos la clase Amigo
class Amigo implements Serializable{
	private String nombre;
	
	public Amigo(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
}

// creamos la clase MejorAmigo.
class MejorAmigo extends Amigo{
	private int nivelConfianza;
	
	public MejorAmigo(String nombre, int nivelConfianza) {
		super(nombre);
		this.nivelConfianza = nivelConfianza;
	}
	
	public int getNivelConfianza() {
		return nivelConfianza;
	}
}



