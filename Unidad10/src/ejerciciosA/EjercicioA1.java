package ejerciciosA;
import java.util.*;
import java.io.*;
public class EjercicioA1 {

	public static void main(String[] args) throws Exception {

		String ruta;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduce la ruta del sistema de archivos:");
			ruta=sc.nextLine();
			muestraInfoRuta(new File(ruta));

		}while(!ruta.equals(""));

	}

	public static void muestraInfoRuta(File fichero) throws Exception {

		if (fichero.exists()) {
			if(fichero.isFile()) {
				System.out.println("El nombre del fichero es: "+fichero.getName());
			} else if (fichero.isDirectory()) {
				
				File[] ficheros = fichero.listFiles();
				
				for (File e : ficheros) {
					if(e.isDirectory()) {
						System.out.println("[*]"+e.getName());
					}
				}
				
				for (File e : ficheros) {
					if(e.isFile()) {
						System.out.println("[A]"+e.getName());
					}
				}
			} else {
				throw new FileNotFoundException();
			}
		}






	}

}
