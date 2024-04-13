package ejercicios_A;
import java.util.*;
public class ejercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introducer valor: ");
		int a; 
		
		try{
			a = sc.nextInt();
			System.out.println("El valor es: "+a);
		} catch(Exception e){
			System.out.println("Valor no válido");
		}
		
	}

}
