package mainPackageModelo;

import java.time.*;

public abstract class Empleado {
	private String nombre;
	private String direccion;
	private EstadoCivil estadoCivil;
	private LocalDate fechaNac;
	private double sueldoBase;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(Double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public Empleado(String nombre, String direccion, EstadoCivil estadoCivil, LocalDate fechaNac, double sueldoBase) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNac = fechaNac;
		this.sueldoBase = sueldoBase;
	}
	
	
	public int getEdad() {
		LocalDate diaActual = LocalDate.now();
		Period periodo = Period.between(this.getFechaNac(), diaActual);
		return periodo.getYears();
	}
	
	public abstract double retenciones();
	public abstract double sueldoBruto();
	public double sueldoNeto() {
		return this.sueldoBruto()-this.retenciones();
	};	
}