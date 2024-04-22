package gestionFicheros;
import java.util.*;
import java.io.*;
public class ejercicioA3 {

	// sandra recuerda que el problema es que tenemos que declarar bien cual es el padre para poder usar los hijos
	
	public static void main(String[] args) {
		String nombre ="";
		String newNom ="";
		boolean cambia = false;
		
		File documento = new File("Documentos");
		File docs = new File ("DOCS");
		documento.renameTo(docs);
		File[] archivosDoc = docs.listFiles();
			
			for(File e : archivosDoc) {
				
				if(e.isDirectory()) { // si es una carpeta... :
					if(e.getName().equals("Fotografias")){
						nombre = e.getParent()+"/"+e.getName(); // pillamos la ruta del archivo
						cambia = cambiarNombreArchivo(nombre,e.getParent()+"/"+"FOTOS");
						if(!cambia) {
							System.out.println("No se ha modificado");
						}else {
							System.out.println("Se ha cambiado");
						}
					} else if (e.getName().equals("Libros")){
						nombre = e.getParent()+"/"+e.getName(); // pillamos la ruta del archivo
						cambia = cambiarNombreArchivo(nombre,e.getParent()+"/"+"LECTURAS");
						if(!cambia) {
							System.out.println("No se ha modificado");
						}else {
							System.out.println("Se ha cambiado");
						}
					}
					
					File[] archivos2 = e.listFiles();
					for(File a : archivos2) {
						nombre = a.getParent()+"/"+a.getName(); // pillamos la ruta del archivo
						newNom = nombre.substring(0,(nombre.length()-4));
						cambia = cambiarNombreArchivo(nombre,newNom); // le cambiamos el nombre
						if(!cambia) {
							System.out.println("No se ha modificado");
						}else {
							System.out.println("Se ha cambiado");
						}
					}
					
				} else { // si es un archivo... :
					nombre = e.getParent()+"/"+e.getName();
					newNom = nombre.substring(0,(nombre.length()-4));
					cambia = cambiarNombreArchivo(nombre, newNom);
					if(!cambia) {
						System.out.println("No se ha modificado");
					}else {
						System.out.println("Se ha cambiado");
					}
				}
			}
		}
		
	
	public static boolean cambiarNombreArchivo(String ruta, String ruta2) {

		File uno = new File(ruta);
		File dos = new File(ruta2);
		boolean cambio = uno.renameTo(dos);
		return cambio;
		
	}
	
}