package modificacionFicheros;
import java.util.*;
import java.io.*;
public class ejercicioB2 {
	
	
	// preguntar dudas xq no me sale.
	
	public static void main(String[] args) throws FileNotFoundException { // no me apetece hacer un try/catch por lo q simplemente tira la excepcion si sucede.
		
		int sumanota=0, nota=0, contNotas=0, iteraciones = 0;
		File f = new File("Documentos/alumnos_notas.txt");
		Scanner lect = new Scanner(f);
		String[] mediasAlumnos = new String[11];
		
		while(lect.hasNext()) {
			
			String linea = lect.nextLine();
			String[] contLinea = linea.split(" ");
			for (int i=2; i<contLinea.length; i++) {
				nota = Integer.parseInt(contLinea[i]);
				sumanota += nota; 
				contNotas++;
			}
			double media = (double)sumanota/contNotas;
			mediasAlumnos[iteraciones]=contLinea[0]+" "+contLinea[1]+". Nota: "+media;
			iteraciones++;
		}
		
		for(int i=0; i<10; i++) {
			System.out.println("Alumno: "+mediasAlumnos[i]+" sobre 10.");
		}
		
		lect.close();
	}

}
