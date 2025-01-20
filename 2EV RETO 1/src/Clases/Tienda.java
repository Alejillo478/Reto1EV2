package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tienda {
	private int id;
	private String nombre;
	private Empleado gerente;
	private List<Producto> listaProductos;

	public Tienda() {
		this.listaProductos = new ArrayList<>();
	}

	public Tienda(int id, String nombre, Empleado empleado, List<Producto> listaProductos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.gerente = empleado;
		this.listaProductos = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Empleado getEmpleado() {
		return gerente;
	}

	public void setEmpleado(Empleado empleado) {
		this.gerente = empleado;
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	

	@Override
	public String toString() {
		return "Tienda [id=" + id + ", nombre=" + nombre + ", gerente=" + gerente + ", listaProductos=" + listaProductos
				+ "]";
	}

	public void reponerProductos(int cantidad) {
		// TODO Auto-generated method stub
		    Random random = new Random();
		    for (int i = 0; i < cantidad; i++) {
		        int idProducto = listaProductos.size() + 1; 
		        String nombreProducto = "Producto" + idProducto; 
		        double precio = 10 + (random.nextDouble() * 90); 
		        Producto producto = new Producto(idProducto, nombreProducto, precio);
		        listaProductos.add(producto); 
		    }
		
	}

}
