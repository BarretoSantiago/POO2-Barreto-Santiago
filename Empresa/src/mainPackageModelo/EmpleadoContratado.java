package mainPackageModelo;
import java.time.LocalDate;

public class EmpleadoContratado extends Empleado {
	private int numContrato;
	private String medioPago;
	public int getNumContrato() {
		return numContrato;
	}
	public void setNumContrato(int numContrato) {
		this.numContrato = numContrato;
	}
	public String getMedioPago() {
		return medioPago;
	}
	public void setMedioPago(String medioPago) {
		this.medioPago = medioPago;
	}
	public EmpleadoContratado(String nombre,String direccion, EstadoCivil estadoCivil, LocalDate fechaNac, double sueldoBase, int numContrato, String medioPago) {
		super (nombre, direccion, estadoCivil, fechaNac, sueldoBase);
		this.numContrato = numContrato;
		this.medioPago = medioPago;
	}
	@Override
	public double retenciones() {
		return 50.0;
	}
	@Override
	public double sueldoBruto() {
		return this.getSueldoBase();
	}
	

}
