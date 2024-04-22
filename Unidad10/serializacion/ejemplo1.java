package serializacion;
import java.io.*;



class Amigos implements Serializable{
	
	private String nombre;
	
	public Amigos(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

}


public class ejemplo1 {

	public static void main(String[] args) {
		File archivo = new File("amigos.txt");
		
		try { // parte de serializacion (EMISOR/CREADOR) de la info.	
			FileOutputStream archivoDeSalida = new FileOutputStream(archivo);
			ObjectOutputStream objetoDeSalida = new ObjectOutputStream(archivoDeSalida);
			
			// Escribimos el objeto en el stream de salida.
			Amigos amigo = new Amigos("Ferran");
			objetoDeSalida.writeObject(amigo);
			
			archivoDeSalida.close();
			objetoDeSalida.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try { // parte de des-serializacion (RECEPTOR/LECTOR) de la info.
			
			FileInputStream archivoDeEntrada = new FileInputStream(archivo);
			ObjectInputStream objetoDeEntrada = new ObjectInputStream(archivoDeEntrada);
			
			// Leemos el objeto en ek stream de entrada.
			Amigos amigoDesSerializado = (Amigos)objetoDeEntrada.readObject();
			
			archivoDeEntrada.close();
			objetoDeEntrada.close();
			
			System.out.println("Se ha encontrado al amigo: "+amigoDesSerializado.getNombre());
			
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}	
		
	}

}
