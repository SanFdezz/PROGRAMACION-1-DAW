package hashMap;
import java.util.*;
public class CuentaChars {

	public static void main(String[] args) {
		int valor;
		String frase = "¡Estudiad mucho, que llega el tercer trimestre!";
		// este HashMap almacena cada cáracter y su frecuencia en un texto (string)
		HashMap <Character, Integer> cuentaChars = new HashMap <Character, Integer>();
		// recorremos la frase/texto para almacenar cada letra
		for (char letra : frase.toLowerCase().toCharArray()) {
			if(Character.isLetter(letra)) { // descarto lo que no sea letra (" " , ' ? ¡...)
				if (cuentaChars.containsKey(letra)){
					valor = cuentaChars.get(letra);
					cuentaChars.put(letra, valor+1);
				} else {
					cuentaChars.put(letra, 1); // la primera ocurrencia se guarda con 1;
				}
			}
		} // System.out.println(cuentaChars);
		// creo una vista para recorrer los elementos del map.
		for (HashMap.Entry<Character,Integer> e: cuentaChars.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}

	}

}
