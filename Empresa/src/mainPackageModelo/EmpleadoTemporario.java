package mainPackageModelo;
import java.time.LocalDate;

public class EmpleadoTemporario extends Empleado {
	private LocalDate fechaFin;
	private int cantHorasExtra;
	
	public int precioHoraExtra() {
		return 40;
	}
	
	public double aportesJubilatorios() {
		return this.sueldoBruto()*0.10 + this.getCantHorasExtra()*5;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getCantHorasExtra() {
		return cantHorasExtra;
	}

	public void setCantHorasExtra(int cantHorasExtra) {
		this.cantHorasExtra = cantHorasExtra;
	}

	@Override
	public double retenciones() {
		return this.sueldoBruto()*0.10 + this.siSuperaLos50Suma(25.0);
	}

	@Override
	public double sueldoBruto() {
		return this.getSueldoBase()+this.precioHoraExtra()*this.getCantHorasExtra();
	}

	public EmpleadoTemporario (String nombre,String direccion, EstadoCivil estadoCivil, LocalDate fechaNac, double sueldoBase, LocalDate fechaFin, int cantHorasExtra) {
		super (nombre, direccion, estadoCivil, fechaNac, sueldoBase);
		this.fechaFin = fechaFin;
		this.cantHorasExtra = cantHorasExtra;		
	}
	
	public double siSuperaLos50Suma(double cantidad) {
		if (this.getEdad()>50) {
			return cantidad;
		} else {
			return 0.0;
		}
	}
}
