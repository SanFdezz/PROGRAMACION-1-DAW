package ejerciciosBasicos;
import java.util.*;
public class diccionarioDos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String palabra="";
		HashMap <String,String> diccionario = new HashMap <String,String>(); // creamos un hashmap para guardar el diccionario
		

		// guardamos los datos en el hashmap
		diccionario.put("tarde","afternoon");
		diccionario.put("trabajo","work");
		diccionario.put("españa","spain");
		diccionario.put("comida","lunch");
		diccionario.put("unico","unique");
		diccionario.put("libro","book");
		diccionario.put("helado","ice cream");
		diccionario.put("alegre","happy");
		diccionario.put("tristeza","sadness");
		diccionario.put("mesa","table");
		diccionario.put("dedos","fingers");
		diccionario.put("juegos","games");
		diccionario.put("mañana","tomorrow");
		diccionario.put("lunes","monday");
		diccionario.put("luna","moon");
		diccionario.put("planeta tierra", "planet earth");
		diccionario.put("gorra","cap");
		diccionario.put("taza","cup");
		diccionario.put("tarro","jar");
		diccionario.put("chicle","gum");
		
		
		ArrayList<String> espanyol = new ArrayList <String>(diccionario.keySet()); // y el arraylist para las palabras en español
			// creamos un array de strings que se rellene con lo q devuelva la funcion miniDiccionario
			String [] miniDic = miniDiccionario(espanyol,5);
			// creamos los contadores necesarios
			int correctas = 0;
			int incorrectas = 0;
			
			System.out.println("¡Aprende inglés! Escribe la traducción al inglés de las siguientes palabras:");
			// comienza el cuestrionario;
			for(String word : miniDic) {
				System.out.println(word+":"); // palabra a traducir
				palabra=sc.nextLine(); // palabra traducida por el user
				if(palabra.equalsIgnoreCase(diccionario.get(word))) { // comprobamos si la traduccion es correcta
					System.out.println("¡Así es!"); // mostramos esto si lo es
					correctas++; // y sumamos al cont de correctas
				} else {
					System.out.println("Ups, esa no es la traducción correcta..."); // si no es correcta, mostramos esto
					System.out.println("La solución sería: "+diccionario.get(word)); // decimos la solucion correcta
					incorrectas++;// y sumamos al contador de incorrectas
				}
			
			}
			
			// mostramos los resultados.
			System.out.println("Resumen:");
			System.out.println("Respuestas acertadas: "+correctas);
			System.out.println("Respuestas falladas:"+incorrectas);

			sc.close();
	}

	public static String[] miniDiccionario( ArrayList<String> espanyol, int cantidad) { // creamos la función para hacer el miniDiccionario

		String[] dic = new String[cantidad]; //creamos el array simple

		for(int i=0; i<cantidad; i++){ 
			int indice=(int)(Math.random()*espanyol.size()); // aleatoriza las palabras del miniDic
			dic[i]=espanyol.get(indice);
		}

		return dic;

	}

}
