package netflix;
import java.util.*;
public class Netflix {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception{

		ArrayList <contenido> netflix = new ArrayList <contenido>();
		int opcion;

		do{
			// obtenemos la opcion y nos aseguramos de que es valida, si no, repite el bucle de nuevo.
			opcion=menu();
			if(opcion==0) {
				continue;
			}

			switch (opcion){
			case 1:
				solicitarDatosPelicula(netflix);
				break;
			case 2:
				solicitarDatosSerie(netflix);
				break;
			case 3:
				verContent(netflix);
				break;
			case 4:
				
				break;
			case 5:
				break;
			case 6:
				System.out.println("Gracias por utilizar Netflix.");
				break;
			default: 
				System.out.println("Opción no válida, elija una del 1 al 6.");
				break;
			}





		}while(opcion!=6);

	}

	public static int menu() {
		int opcion=0;
		System.out.println("----------------------------------------");
		System.out.println("1-Dar de alta una pelicula.");
		System.out.println("2-Dar de alta una serie");
		System.out.println("3-Ver un contenido.");
		System.out.println("4-Listar contenido.");
		System.out.println("5-Listar contenido pendiente por ver.");
		System.out.println("6-Salir.");
		System.out.println("----------------------------------------");
		System.out.println("Seleccione la opción deseada:");

		try {
			opcion = sc.nextInt();
			sc.nextLine();
		} catch(Exception e) {
			System.out.println("Opción no válida.");
			sc.nextLine();
		}
		return opcion;
	}

	public static void solicitarDatosPelicula(ArrayList <contenido> netflix) throws Exception{
		boolean todoApto;
		do {
			int anyo=0,numNom=0,oscar=0;
			todoApto=true;
			// pedimos nombre y productora
			System.out.println("Introduzca el nombre de la pelicula:");
			String nombre=sc.nextLine();
			System.out.println("Introduzca la productora de la peli:");
			String prod=sc.nextLine();
			// pedimos un año valido
			try {
				System.out.println("Introduzca el año de publicacion:");
				anyo = sc.nextInt();
				sc.nextLine();
				if(anyo>2024) {
					throw new Exception("No puede ser de un año futuro.");
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
				todoApto=false;
				continue;
			}
			// pedimos nominaciones validas
			try {
				System.out.println("Introduzca num de nominaciones:");
				numNom = sc.nextInt();
				sc.nextLine();
				if(numNom<0) {
					throw new Exception("No puede tener un número negativo de nominaciones.");
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
				todoApto = false;
				continue;
			}
			// pedimos oscars validos
			try {
				System.out.println("Introduzca num de oscars ganados:");
				oscar =sc.nextInt();
				sc.nextLine();
				if(oscar>numNom) {
					throw new Exception("No puede tener más oscars que nominaciones, no tiene sentido.");
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
				todoApto=false;
				continue;
			}
			// si no ha habido ningu error, añadimos la peli al arraylist
			if(todoApto) {
				pelicula peli = new pelicula(nombre, prod, anyo, false, numNom, oscar);
				netflix.add(peli);
			}
			// y salimos.
		} while(todoApto!=true);
	}

	public static void solicitarDatosSerie(ArrayList <contenido> netflix) {
		boolean todoApto;
		do {
			int anyo=0,numTemp=0;
			String terminada="";
			boolean acabada=false;
			todoApto=true;
			// pedimos nombre y productora
			System.out.println("Introduzca el nombre de la serie:");
			String nombre=sc.nextLine();
			System.out.println("Introduzca la productora de la serie:");
			String prod=sc.nextLine();
			// pedimos un año valido
			try {
				System.out.println("Introduzca el año de publicacion:");
				anyo = sc.nextInt();
				sc.nextLine();
				if(anyo>2024) {
					throw new Exception("No puede ser de un año futuro.");
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
				todoApto=false;
				continue;
			}
			// pedimos temporadas validas
			try {
				System.out.println("Introduzca num de temporadas:");
				numTemp = sc.nextInt();
				sc.nextLine();
				if(numTemp<0) {
					throw new Exception("No puede tener un número negativo de temporadas.");
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
				todoApto = false;
				continue;
			}
			// preguntamos si la ha terminado
			try {
				System.out.println("¿Terminada? (s/n)");
				terminada =sc.nextLine();
				if(terminada.equalsIgnoreCase("S")) {
					acabada=true;
				} else if (terminada.equalsIgnoreCase("N")) {
					acabada=false;
				} else {
					throw new Exception("Opción no válida, ingresa o S o N la próxima vez.");
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
				todoApto=false;
				continue;
			}
			// si no ha habido ningu error, añadimos la peli al arraylist
			if(todoApto) {
				serie Serie = new serie(nombre, prod, anyo, false, numTemp, acabada);
				netflix.add(Serie);
			}
			// y salimos.
		} while(todoApto!=true);
	}

	public static void verContent(ArrayList <contenido> netflix) {
		boolean existe=false;
		System.out.println("Qué pelicula o serie quieres ver?");
		String paraVer = sc.nextLine();
		for (contenido e : netflix) {
			String nom = e.getTitulo();
			if (nom.equalsIgnoreCase(paraVer)) {
				e.setVisto(true);
				existe=true;
				break;
			}
			if(!existe) {
				System.out.println("No se ha encontrado ese título.");
			} else {
				System.out.println("Modificado correctamente.");
			}
		}

	}


















	// comenzamos con la herencia
	static class contenido{

		protected String titulo;
		protected String productora;
		protected int añoPublicacion;
		protected boolean visto;

		public contenido(String titulo, String productora, int añoPublicacion, boolean visto) {
			this.titulo = titulo;
			this.productora = productora;
			this.añoPublicacion = añoPublicacion;
			this.visto = visto;
		}

		protected void verContenido() {
			this.visto=true;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setVisto(boolean visto) {
			this.visto = visto;
		}

	}

	static class serie extends contenido{

		protected int numTemporadas;
		protected boolean terminada;

		public serie(String titulo, String productora, int añoPublicacion, boolean visto, int numTemporadas, boolean terminada) {
			super(titulo,productora,añoPublicacion,visto);
			this.numTemporadas = numTemporadas;
			this.terminada = terminada;
		}

	}


	static class pelicula extends contenido{

		protected int numNominaciones;
		protected int numOscars;

		public pelicula(String titulo, String productora, int añoPublicacion, boolean visto, int numNominaciones, int numOscars) {
			super(titulo,productora,añoPublicacion,visto);
			this.numNominaciones = numNominaciones;
			this.numOscars = numOscars;
		}


	}

}
