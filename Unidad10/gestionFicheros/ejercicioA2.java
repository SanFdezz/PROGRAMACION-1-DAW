package gestionFicheros;
import java.util.*;
import java.io.*;
public class ejercicioA2 {
	
	public static void main(String[] args) throws FileNotFoundException {

		String ruta;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduzca una ruta:");
			ruta=sc.nextLine();
			if(ruta.equals("")) {
				System.out.println("Programa finalizado.");
				break;
			}
			muestraInfoRuta(new File(ruta));

		}while(!ruta.equals(""));

	}

	public static void muestraInfoRuta(File ruta) throws FileNotFoundException {
		
		if(ruta.exists()) {
			
			if(ruta.isFile()) {
				System.out.println("[A]"+ruta.getName());
				
			} else if(ruta.isDirectory()) {
				
				// creamos una array de los ficheros que hay en esa carpeta
				File[] archivos = ruta.listFiles();
				
				if(archivos != null) {
					Arrays.sort(archivos);
					for(File e : archivos) {
						Date fecha = new Date(e.lastModified());
						if(e.isDirectory()) {
							System.out.println("[*]"+e.getName()+"|| FECHA DE MODIFICACIÓN: "+fecha);
						}
					}
					for (File e : archivos) {
						Date fecha = new Date(e.lastModified());
						if (e.isFile()) {
							System.out.println("[A]"+e.getName()+"|| TAMAÑO DEL ARCHIVO: "+e.length()+"bytes ||  FECHA DE MODIFICACION: "+fecha);
						}
					}	
				}

			}
			
		} else {
			throw new FileNotFoundException();
		}
	}

}