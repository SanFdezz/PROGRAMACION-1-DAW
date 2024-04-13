package herenciaB;

public class Figuras {

	protected double area=0;
	
	public Figuras() {
		
	}
	
	public double area() {
		return area;
	}

}

class Circulo extends Figuras{
	
	int radio;
	
	public Circulo(int radio) {
		super();
		this.radio = radio;
		calcularArea();
	}
	
	
	private void calcularArea(){
		area = Math.PI * Math.pow(radio, 2);
	}
	
}

class Cuadrado extends Figuras{
	
	int lado;
	
	public Cuadrado(int lado) {
		super();
		this.lado = lado;
		calcularArea();
	}
	
	private void calcularArea(){
		area = Math.pow(lado, 2);
	}
	
}

class Triangulo extends Figuras{
	
	int base, altura;
	
	public Triangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
		calcularArea();
	}
	
	private void calcularArea(){
		area = (base*altura)/2;
	}
	
}

