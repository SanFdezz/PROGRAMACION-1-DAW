package Agenda2punto0;

public class contactos {
	
	private String nombre;
	private String telefono;
	private String email;
	
	// Constructor de Contacto
	public contactos(String nombre, String telefono, String email) {
		this.nombre=nombre;
		this.telefono=telefono;
		this.email=email;
	}
	
	// Mostrar datos de contacto
	
	public void mostrarDatos() {
		System.out.println("Nombre: "+nombre+"      Teléfono: "+telefono+"      Email: "+email);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
