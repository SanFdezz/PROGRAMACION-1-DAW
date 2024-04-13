package miniTerminal;
import java.util.*;
import java.io.*;
public class principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String comando="", contenido, rutas, destino;
		boolean cambios;
		
		do {
			System.out.println("PS C:/");
			contenido=sc.nextLine();
			try {
				// para saber que comando ha introducido, leemos hasta el primer espacio.
				comando=captarComando(contenido);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
			
			switch(comando) {
			case "pwd":
				System.out.println(MiniFileManager.getPWD());
				break;
			case "cd":
				rutas=captarContenido(contenido);
				cambios=MiniFileManager.changeDir(rutas);
				if(cambios) {
					System.out.println("cambios realizados.");
				}else {
					System.out.println("No se han podido realizar los cambios.");
				}
				break;
			case "ls":
				MiniFileManager.printList();
				break;
			case "ll":
				MiniFileManager.printListLL();
				break;
			case "mkdir":
				rutas=captarContenido(contenido);
				MiniFileManager.createDirectory(rutas);
				break;
			case "rm":
				rutas=captarContenido(contenido);
				cambios=MiniFileManager.removeDirectory(rutas);
				if(cambios) {
					System.out.println("Se ha eliminado correctamente.");
				} else {
					System.out.println("No se ha podido eliminar.");
				}
				break;
			case "mv":
				rutas=captarContenido(contenido);
				destino=captarContenido(rutas);
				int pos = rutas.indexOf(" ");
				String origen = rutas.substring(0,pos);
				MiniFileManager.moveFile(origen, destino);
				break;
			case "help":
				mostrarAyuda();
				break;
			}
			
		}while(!comando.equals("exit"));
		
		
	}

	public static void mostrarAyuda() {
		// mostramos los comandos y sus funciones
		System.out.println("Lista de comandos:");
		System.out.println("pwd: Muestra cual es la carpeta actual.");
		System.out.println("cd <DIR>: Cambia la carpeta actual a ‘DIR’. Con .. cambia a la carpeta superior.");
		System.out.println("ls: Muestra la lista de directorios y archivos de la carpeta actual");
		System.out.println("ll: Como ls pero muestra también el tamaño y la fecha de última modificación.");
		System.out.println("mkdir <DIR>: Crea el directorio ‘DIR’ en la carpeta actual.");
		System.out.println("rm <FILE>: Borra ‘FILE’.");
		System.out.println("mv <FILE1><FILE2>: Mueve o renombra ‘FILE1’ a ‘FILE2’.");
		System.out.println("help: Muestra una breve ayuda con los comandos disponibles.");
		System.out.println("exit: Termina el programa.");

	}
	
	public static String captarComando(String cont) throws Exception{ 
		// creamos variables
		String comand="";
		
		// recortamos hasta el primer espacio
		int posicion = cont.indexOf(" ");
		if(posicion>-1) {
			comand = cont.substring(0,posicion);
		} else {
			comand = cont;
		}
		// vemos que sea valido
		if(!comand.equals("pwd") && !comand.equals("cd") && !comand.equals("ls") && !comand.equals("ll") && !comand.equals("mkdir") && !comand.equals("rm") && !comand.equals("mv") && !comand.equals("help") && !comand.equals("exit")) {
			throw new Exception("Comando no valido");
		}
		// devolvemos el comando
		return comand;
	}
	
	public static String captarContenido(String cont) {
		// creamos las variables y obtenemos cual es el contenido mediante el substring
		String content="";
			int pos = cont.indexOf(" ");
			content = cont.substring(pos+1);
		return content;
	}
	
}
