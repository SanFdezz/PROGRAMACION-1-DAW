package herenciaB;
import java.util.*;
public class ProgramaFiguras {

	public static void main(String[] args) {
		
		ArrayList<Figuras> figuras = new ArrayList<Figuras>();
		figuras.add(new Circulo(10)); // Radio=10
		figuras.add(new Cuadrado(10)); // Lado=10
		figuras.add(new Triangulo(10,5)); // Base=10, Altura=5;
		for (Figuras f: figuras)
		System.out.println("Área: " + f.area());
		
	}

}
