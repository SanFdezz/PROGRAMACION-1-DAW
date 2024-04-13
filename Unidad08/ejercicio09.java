package ejercicios_A;
import java.util.*;
public class ejercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor 2:");
		
		
		
		try{
			System.out.println("Valor 1:");
			int a = sc.nextInt();
			System.out.println("El valor es: "+a);
		} catch(Exception e){
			System.out.println("Valor no válido");
		}
		
		try{
			System.out.println("Valor 2:");
			int b = sc.nextInt();
			System.out.println("El valor es: "+b);
		} catch(Exception e){
			System.out.println("Valor no válido");
		}
		
		
		try {
			System.out.println("a/b=");
		}catch(InputMismatchException y) {
			System.out.println("No has introducido un número");
		}catch(ArithmeticException e) {
			System.out.println("No se puede dividir entre 0");
		}
		

	}
	
	

}
