package queue;
import java.util.*;
public class colaExplicacion {

	public static void main(String[] args) {

		Queue <String> colaCine = new LinkedList<String>();	
		colaCine.add("Juan");
		colaCine.add("Perico");
		colaCine.add("Andrés");
		System.out.println(colaCine);
		System.out.println("El que lleva más tiempo esperando es: "+colaCine.element()); // o colaCine.peek();
		
		colaCine.remove();
		System.out.println(colaCine);
		
		colaCine.add("Tardón");
		System.out.println(colaCine);
		
		
		
		
		
		
		
		
		
		
	}

}
