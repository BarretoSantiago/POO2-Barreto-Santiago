package mainPackageModelo;
import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {
	private int cantidadHijos;
	private int antiguedad;
	
	public EmpleadoPermanente(String nombre,String direccion, EstadoCivil estadoCivil, LocalDate fechaNac, double sueldoBase, int cantidadHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNac, sueldoBase);
		this.setCantidadHijos(cantidadHijos);
		this.setAntiguedad(antiguedad);
	}
	public double asignacionXHijo(){
		return 150.0;
	}
	public double precioAnoAntiguedad() {
		return 50.0;
	}
		public int getCantidadHijos() {
		return cantidadHijos;
	}
	public double retencionXHijo() {
		return 20.0;
	}
	public double aportesJubilatorios() {
		return this.sueldoBruto()*15/100;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public double salarioFamiliar() {
		return this.asignacionXHijo() * this.getCantidadHijos() + this.getEstadoCivil().getAsignacion() + this.getAntiguedad() * this.precioAnoAntiguedad();
	}
	@Override
	public double retenciones() {
		return this.sueldoBruto()*0.10 + this.retencionXHijo()*this.getCantidadHijos()+this.aportesJubilatorios();
	}

	@Override
	public double sueldoBruto() {
		return this.getSueldoBase()+this.salarioFamiliar();
	}
}
