package Agenda2punto0;
import java.util.*;
public class Agenda {

	public static void main(String[] args) {

		ArrayList<contactos> agenda = new ArrayList<contactos>();
		Scanner sc = new Scanner(System.in);
		boolean contiene=false;
		
		do {
			int opcion;
			do {
				System.out.println();
				System.out.println("1. Ver contacto");
				System.out.println("2. Añadir contacto");
				System.out.println("3. Eliminar contacto");
				System.out.println("4. Buscar contacto");
				System.out.println("5. Salir");
				System.out.println("Elige:");
				opcion=sc.nextInt();
				sc.nextLine(); // limpiar el buffer

			} while(opcion<=0 || opcion >5);

			switch(opcion) {
			case 1:
				mostrarContactos(agenda);
				break;

			case 2: 
				System.out.println("Introduce nombre:");
				String nombre = sc.nextLine();
				System.out.println("Introduce telefono:");
				String telefono = sc.nextLine();
				System.out.println("Introduce email:");
				String email = sc.nextLine();
				agenda.add(new contactos(nombre, telefono, email));
				System.out.println("Se ha añadido perfectamente.");
				break;

			case 3:
				mostrarContactos(agenda);
				System.out.println("Id del contacto a eliminar:");
				int id = sc.nextInt();
				sc.nextLine();
				if(id >=0 && id<agenda.size()) agenda.remove(id);
				else System.out.println("El id introducido no existe");
				break;

			case 4:
				System.out.println(agenda);
				System.out.println("Introduce un nombre, telefono o email.");
				String c = sc.nextLine();
				for(contactos e: agenda) {
					// rellenar esto con el .equals 
				}
				
				if(contiene==true) {
					System.out.println("siii");
				} else {
					System.out.println("No coincide con ningún dato registrado.");
				}

			case 5: System.out.println("Saliendo del programa."); return;					
			} 

		} while(true);

	}

	private static void mostrarContactos(ArrayList<contactos> agenda) {
		int cont=0;
		if(agenda.isEmpty()) {
			System.out.println("No hay contactos.");
		} else {
			for(contactos e: agenda) {
				System.out.print(cont+". ");
				e.mostrarDatos();
				cont++;
			}
		}
	}

}


