package cifrado;
import java.util.*;
import java.io.*;
public class cifradoCesar {

	public static void main(String[] args){
		
		// creamos el scanner de lector de teclado.
		Scanner kbd = new Scanner(System.in);
		
		// declaramos las variables
		String name, password, phrase;
		boolean valid;
		String[] noValido = {"á","é","í","ó","ú","ü","ñ"};
		
		
		// creamos un bucle para registrar bien los datos a cifrar.
		while(true) {
			valid = false;
			System.out.println("Introduce un nombre de usuario (entre 5 y 15 caracteres):");
			name = kbd.nextLine().toLowerCase();
			
			for(int i=0; i<noValido.length; i++) {
				if(name.contains(noValido[i])) {
					valid=true;
					break;
				}
			}
			
			if(valid) {
				
				System.out.println("Nombre no valido, contiene acentos, diereis o Ñ.");
				continue;
				
			} else if (name.length()<5 || name.length()>15) {
				
				System.out.println("Nombre no válido.");
				continue;
				
			}
			
			System.out.println("Introduce una contraseña (entre 5 y 15 caracteres):");
			password = kbd.nextLine().toLowerCase();
			
			for(int i=0; i<noValido.length; i++) {
				if(password.contains(noValido[i])) {
					valid=true;
					break;
				}
			}
			
			if(valid) {
				
				System.out.println("Contraseña no valida, contiene acentos, diereis o Ñ.");
				continue;
				
			} else if (password.length()<5 || password.length()>15) {
				
				System.out.println("Contraseña no válida.");
				continue;
				
			}
		
			System.out.println("Introduce una frase de recordatorio de la contraseña (mínimo 15 caracteres):");
			phrase = kbd.nextLine().toLowerCase();
			
			for(int i=0; i<noValido.length; i++) {
				if(phrase.contains(noValido[i])) {
					valid=true;
					break;
				}
			}
			
			if(valid) {
				
				System.out.println("Frase recordatoria no válida, contiene acentos, diereis o Ñ.");
				continue;
				
			} else if (phrase.length()<15) {
				
				System.out.println("Frase recordatoria no válida.");
				continue;
				
			}
			break; // acaba el bucle	
		}
		
		
		try {
			File toWrite = new File("src/cifrado/cifrado.txt");
			FileWriter writer = new FileWriter(toWrite);
			
			char[] nameChars = name.toCharArray();

			for(int i=0; i<nameChars.length; i++) {

				char newChar = (char)((nameChars[i]-'a'+5)%26+'a'); // la 'a' es igual que 97
				writer.write(newChar);

			}
			writer.write("\n");
			
			char[] passChars = password.toCharArray();

			for(int i=0; i<passChars.length; i++) {

				char newChar = (char)((passChars[i]-'a'+5)%26+'a'); // la 'a' es igual que 97
				writer.write(newChar);

			}
			writer.write("\n");
			
			char[] phraseChars = phrase.toCharArray();

			for(int i=0; i<phraseChars.length; i++) {

				char newChar = (char)((phraseChars[i]-'a'+5)%26+'a'); // la 'a' es igual que 97
				writer.write(newChar);

			}
			writer.write("\n");
			
			kbd.close();
			writer.close();
			
			System.out.println("Cifrado con éxito.");
			
		} catch (IOException e) {
			System.out.println("no se ha podido realizar el fichero.");
		}
		
	}
}
