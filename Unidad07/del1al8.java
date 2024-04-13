package ejerciciosBasicos;

import java.util.*;
public class del1al8 {

	public static void main(String[] args) {
		
		// primer ejercicio
		
		ArrayList <String> colores = new ArrayList<String>();
		colores.add("Rojo");
		colores.add("Naranja");
		colores.add("Amarillo");
		colores.add("Verde");
		colores.add("Azul");
		colores.add("Morado");

		System.out.println(colores);
		System.out.println();
		
		// segundo ejercicio
		
		for(String e : colores) {
			System.out.println(e);
		}
		System.out.println();
		
		// tercer ejercicio
		
		colores.add(0,"Rosa");
		System.out.println(colores);
		System.out.println();

		// cuarto ejercicio

		System.out.println("El color con el índice 3 es: "+colores.get(3));
		System.out.println();
		
		// quinto ejercicio
		
		colores.set(0, "Violeta");
		System.out.println(colores);
		System.out.println();

		// sexto ejercicio
		
		colores.remove(3);
		System.out.println(colores);
		System.out.println();
		
		// septimo ejercicio
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un color");
		String c = sc.nextLine();
		if(colores.contains(c)) System.out.println("Sí que contiene ese color");
		else System.out.println("No contiene el color");
		
		System.out.println();
		
		// octavo ejercicio
		Collections.sort(colores);
		System.out.println(colores);
		
	}

}