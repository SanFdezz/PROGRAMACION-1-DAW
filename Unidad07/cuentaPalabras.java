package ejerciciosBasicos;
import java.util.*;
public class cuentaPalabras {

	public static void main(String[] args) {
		
		
		String frase ="En el mes que estamos toca estudiar que llega el examen";
		
		HashMap <Character,ArrayList<String>> diccionario = new HashMap <Character,ArrayList<String>>();
		
		String[] palabras = frase.toLowerCase().split(" ");
		
		for(String palabra : palabras) {
			
			if(diccionario.containsKey(palabra.charAt(0))) {
				diccionario.get(palabra.charAt(0)).add(palabra);
			} else {
				ArrayList <String> nuevaLetra = new ArrayList<String>();
				nuevaLetra.add(palabra);
				diccionario.put(palabra.charAt(0),nuevaLetra);
			}
			
		}

		System.out.println(diccionario.containsKey("q"));
		
		for(HashMap.Entry<Character,ArrayList<String>> e: diccionario.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}

		// añadir una funcion de busqueda.
		
	}

}
