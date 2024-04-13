package clasesAbstractas;

import java.util.ArrayList;

public class ejercicioAstros {
public static void main(String[] args) {
		
		planeta p1 = new planeta("Tierra", 326, 27, 15948475);
		planeta p2 = new planeta("Marte", 558, 21, 456842447);
		
		p1.anyadir(p1);
		//p1.anyadir(s1);
	}

}

abstract class astros{
	
	protected String nombre;
	protected double masa;
	protected double tempMedia;
	protected static ArrayList <astros> astro = new ArrayList <astros>();
	
	public astros(String nombre, double masa, double tempMedia) {
		this.nombre=nombre;
		this.masa = masa;
		this.tempMedia = tempMedia;
	}
	
	protected abstract void mostrarInfo();
	
	protected void eliminar(astros aBorrar) {
		astro.remove(aBorrar);
	}
	
	protected void anyadir(astros aAnyadir) {
		astro.add(aAnyadir);
	}

}

class sistemaSolar extends astros{
	
	public sistemaSolar(String nombre, double masa, double tempMedia, int distanciaSol) {
		super(nombre,masa,tempMedia);
	}
	
	protected void mostrarInfo() {
		System.out.println("Nombre del sistema: "+nombre);
	}
	
}

class planeta extends astros {
	
	protected int distanciaSol;
	
	public planeta(String nombre, double masa, double tempMedia, int distanciaSol) {
		super(nombre,masa,tempMedia);
		this.distanciaSol = distanciaSol;
	}
	
	protected void mostrarInfo() {
		System.out.println("Nombre del planeta: "+nombre+". Masa del planeta: "+masa+"kg. Temperatura media del planeta: "+tempMedia+"ºC. Distancia al sol: "+distanciaSol+"km.");
	}

	protected void infoSatelites() {
		
		for (astros e : astro) {
			e.mostrarInfo();
		}
		
	}
	
}

class satelite extends astros{
	
	protected int distanciaPlaneta;
	
	public satelite(String nombre, double masa, double tempMedia, int distanciaPlaneta) {
		super(nombre,masa,tempMedia);
		this.distanciaPlaneta = distanciaPlaneta;
	}
	
	protected void mostrarInfo() {
		System.out.println("Nombre del satélite: "+nombre+". Masa del satélite: "+masa+"kg. Temperatura media del satélite: "+tempMedia+"ºC. Distancia del planeta: "+distanciaPlaneta+"km.");
	}
	

}
