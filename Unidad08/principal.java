package ejercicios_C;
import java.util.*;
public class principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList <gato> ListaGatos = new ArrayList <gato>();
		
		
		for(int i=0; i<5; i++) {
			System.out.println("Introduce nombre del gato:");
			String nom = sc.nextLine();
			System.out.println("Introduce edad del gato:");
			int ed = sc.nextInt();
			sc.nextLine();
			gato gato1 = new gato(nom, ed);
			ListaGatos.add(gato1);
		}
	}

}
