package mainPackageModelo;

public enum EstadoCivil {
	soltero(0.0),
	casado(100.0);
	
	private final double asignacion;
	
	EstadoCivil (double asignacion){
		this.asignacion = asignacion;
	}
	
	public double getAsignacion() {
		return asignacion;
	}
	
}
