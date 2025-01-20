package Clases;

public class Empleado {
	private String nombre;
	private double antig;
	private double sueldo;

	public Empleado() {

	}

	public Empleado(String nombre, int antig) {
		super();
		this.nombre = nombre;
		this.antig = antig;
		this.sueldo = sueldoAnt(antig);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAntig() {
		return antig;
	}

	public void setAntig(int antig) {
		this.antig = antig;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldoAnt(antig);
	}

	public double sueldoAnt(double antig) {
		if (antig < 5) {
			return sueldo = 1000;
		} else if (antig > 5 && antig < 11) {
			return sueldo = 1200;
		} else
			return sueldo = 1500;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", antig=" + antig + ", sueldo=" + sueldo + "]";
	}

}
