package mainPackageModelo;
import java.util.List;
import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private int cuit;
	private List<Empleado> empleados;
	
	public Empresa(String nombre, int cuit) {
		this.setNombre(nombre);
		this.setCuit(cuit);
		this.empleados = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCuit() {
		return cuit;
	}
	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	
	public void agregarEmpleado(Empleado e) {
        this.empleados.add(e);
    }
	public double totalSueldosNetos() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.sueldoNeto();
        }
        return total;
    }
	public double totalSueldosBrutos() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.sueldoBruto();
        }
        return total;
	}
	public double totalRetenciones() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.retenciones();
        }
        return total;
    }
	public void liquidarSueldos() {
        for (Empleado e : empleados) {
            System.out.println("Generando recibo para: " + e.getNombre());
        }
    }
	
}
