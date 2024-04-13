package miniTerminal;
import java.io.*;
import java.util.*;
public class MiniFileManager {
	
	// esto indica el directorio en el que estas trabajando.
	static String directorio = System.getProperty("user.dir");
	// lo creamos como archivo
	static File archivoActual = new File(directorio); 
	
	public static String getPWD() { 
		// devolvemos el directorio en el que nos encontramos
		return archivoActual.getAbsolutePath();
	}
	
	public static boolean changeDir(String dir) {
		// creamos una nueva direccion (la que nos dice el usuario)
		File nuevoDestino = new File(dir);
		// creamos las variables
		String padreDir; 
		boolean changes;
		if (dir.equals("..")) { // si el directorio que nosha introducido es igual a ..
			padreDir = archivoActual.getParent(); // pillamos los padres del archivo actual
			if(padreDir != null) { // por si acaso sale mal pasamos por un filtro.
				File padre = new File(padreDir); // creamos esa ruta
				archivoActual= padre; // y cambiamos la ruta actual a la anterior suya, es decir, una carpeta más arriba
				changes=true; // y modificamos su cambio a verdadero
			}else {
				changes= false; // si no, pues su cambio ha sido falso, no realizado.
			}
		}else { // si el directorio indicado era diferente de ..
			try {
				archivoActual=nuevoDestino; // intentamos reemplazar el archivo anterior por el indicado.
				changes = true; // y lo validamos
			}catch(Exception e) {
				System.out.println("Error al cambiar de directorio."); // si no, nos salta este error.
				changes = false; // y no lo validamos
			}
		}
		// devolvemos los resultados
		return changes;
	}
	
	public static void printList() { // para mostrar los nombres de los archivos
		if(archivoActual.isDirectory()) { // miramos si es directorio
			File[] fileList = archivoActual.listFiles(); // listamos sus archivos
			Arrays.sort(fileList); // los ordenamos por ordena alfabético
			for(File e : fileList) { // recorremos el array
				if(e.isDirectory()) { // mostramos los directorios
					System.out.println("[DIR]"+e.getName());
				}
			}
			for(File e : fileList) { // despues hacemos lo mismo para los archivos
				if(e.isFile()) {
					System.out.println("[FILE]"+e.getName());
				}
			}
		} else { // y si no, decimos que efectivamente, no hay nada que recorrer o q simplemente es un file.
			System.out.println("No es un directorio valído para ello.");
		}
	}
	
	public static void printListLL() {
		if(archivoActual.isDirectory()) { // miramos si es directorio
			File[] fileList = archivoActual.listFiles(); // listamos sus archivos
			Arrays.sort(fileList);// los ordenamos por ordena alfabético
			
			for(File e : fileList) {// recorremos el array
				if(e.isDirectory()) { // mostramos los directorios y su fecha de modificacion
					System.out.println("[DIR]"+e.getName() +". Last modified: "+ new Date(e.lastModified()));
				}
			}
			for(File e : fileList) { // despues hacemos lo mismo para los archivos junto con su peso.
				if(e.isFile()) {
					System.out.println("[FILE]"+e.getName()+". Length: "+ e.length() + " bytes. "+"Last modified:"+ new Date(e.lastModified()));
				}
			}
		} else {  // y si no, decimos que efectivamente, no hay nada que recorrer o q simplemente es un file.
			System.out.println("No es un directorio valído para ello.");
		}
	}
	
	public static void createDirectory(String dir) {
		// creamos el directotio que nos introduce el user
		File newDirectory = new File(archivoActual,dir);
		boolean create = newDirectory.mkdir(); // miramos si ha sido valida la creacion
		if(create) { // si ha funcionado, lo mostramos
			System.out.println(newDirectory.getName()+" se ha creado correctamente");
		} else { // si no, mostramos que no se ha podido realizar.
			System.out.println("No se ha podido crear.");
		}
	}
	
	public static boolean removeDirectory(String dir) {
		// creamos el archivo a borrar y variables necesarias
		File toRemove = new File(archivoActual.getAbsolutePath()+"/"+dir);
		boolean valid = false;
		// probamos
		try {
			// tiene que ser directorio
			if(toRemove.isDirectory()) {
				//guardamos su contenido
				File[] files = toRemove.listFiles();
				// si hay contenido:
				if(files.length != 0) {
					// buscamos que no hayan subcarpetas
					for(File e : files) {
						// si las hay,
						if(e.isDirectory()) {
							// decimos que no podemos eliminar la carpeta.
							throw new Exception("No se puede eliminar un directorio con subcarpetas.");
						}
					}
					// si no ha encontrado ninguna subcarpeta, entonces:
					for(File e : files) {
						// eliminamos los archivos
						e.delete();
					}
					// y por ultimo la carpeta inicial.
					valid = toRemove.delete();
					return valid;
				} else { // si no habia archivos dentro, la eliminamos tal cual.
					valid = toRemove.delete();
					return valid;
				}
				// y si no era directorio, era archivo y solo hay q eliminarlo tal cual.
			} else {
				valid = toRemove.delete(); //lo eliminamos
				return valid; // devolvemos si es valido o no el borrado.
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage()); // mostramos excepcion
			return false; // y decimos que no hemos podido eliminar con un boolean
		}
	}
	

	
	public static void moveFile(String dir1, String dir2) {
		// creamos las rutas
		File toChange = new File(archivoActual.getAbsolutePath()+"/"+dir1);
		File destiny = new File(archivoActual.getAbsolutePath()+"/"+dir2);
		
		// si existe el directorio a mover:
		if(toChange.exists()) {
			if(destiny.exists()) { // comprobamos que el destino no exista, y si existe mostramos el error.
				System.out.println("El destino ya existe, por ende, no se puede realizar la acción.");
			} else  { // si no existe, efectuamos el cambio
				toChange.renameTo(destiny);
				System.out.println("La operación se ha realizado con éxito.");
			}
		} else { // y si no existe el archivo, decimos que el cambio no es valido 
			System.out.println("No se puede mover, ya que el directorio a mover no existe.");
		}

	}
	
}
