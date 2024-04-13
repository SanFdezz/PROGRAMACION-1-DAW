package ejerciciosBasicos;
import java.util.*;
public class diccionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String palabra="";
		HashMap <String,String> palabras = new HashMap <String,String>();
		
		palabras.put("tarde","afternoon");
		palabras.put("trabajo","work");
		palabras.put("españa","spain");
		palabras.put("comida","lunch");
		palabras.put("unico","unique");
		palabras.put("libro","book");
		palabras.put("helado","ice cream");
		palabras.put("alegre","happy");
		palabras.put("tristeza","sadness");
		palabras.put("mesa","table");
		palabras.put("dedos","fingers");
		palabras.put("juegos","games");
		palabras.put("mañana","tomorrow");
		palabras.put("lunes","monday");
		palabras.put("luna","moon");
		palabras.put("planeta tierra", "planet earth");
		palabras.put("gorra","cap");
		palabras.put("taza","cup");
		palabras.put("tarro","jar");
		palabras.put("chicle","gum");
		
		do {
			System.out.println("Introduce una palabra:");
			palabra=sc.nextLine().toLowerCase();
			
			if(palabras.containsKey(palabra)) {
				System.out.println("La traducción de la palabra introducida es: "+palabras.get(palabra));
			} else if (palabra.equalsIgnoreCase("salir")) {
				System.out.println("Gracias por usar el diccionario.");
				break;
			} else {
				System.out.println("No se ha encontrado traducción.");
			}
			
		} while(true);

	}

}
