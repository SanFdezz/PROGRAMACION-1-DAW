package herenciaB;
import java.util.*;
public class CuentasBancarias {

	public static void main(String[] args) {


		
	}

}


class cuentaCorriente{
	
	String titular;
	double saldo;
	final double comisionOperacion;
	final double comisionMensual;
	final double interesesMensual;
	
	public cuentaCorriente(String titular, double saldo, final double comisionOperacion, final double comisionMensual, final double interesesMensual) {
		this.titular = titular;
		this.saldo = saldo;
		this.comisionOperacion = comisionOperacion;
		this.comisionMensual = comisionMensual;
		this.interesesMensual = interesesMensual;
	}
	
	protected boolean ingresar(double dinero) {
		saldo = dinero-comisionOperacion;
		return true;
	}
	
	protected boolean retirar(double dinero) {
		return false;
	}
	
	protected void actualizarMensualidad() {
		
	}
	
	
	
}

class cuentaAhorro extends cuentaCorriente{
	
	private static final int maxOperaciones = 3;
	private int contadorOperaciones;
	
	public cuentaAhorro(String titular, double saldo, final double comisionOperacion, final double comisionMensual, final double interesesMensual, int contadorOperaciones) {
		super(titular,saldo,comisionOperacion,comisionMensual,interesesMensual);
		this.contadorOperaciones = contadorOperaciones;
	}
	
}

class cuentaPro extends cuentaCorriente{
	
	public cuentaPro(String titular, double saldo, final double comisionOperacion, final double comisionMensual, final double interesesMensual) {
		super(titular,saldo,comisionOperacion,comisionMensual,interesesMensual);
		
	}
	
}






