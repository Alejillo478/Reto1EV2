package Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cliente {
	private String nombre;
	private Map<Tienda, List<Producto>> listaCompras;

	public Cliente() {
		this.listaCompras = new HashMap<>();
	}

	public Cliente(String nombre, Map<Tienda, List<Producto>> listaCompras) {
		super();
		this.nombre = nombre;
		this.listaCompras = new HashMap<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<Tienda, List<Producto>> getListaCompras() {
		return listaCompras;
	}

	public void setListaCompras(Map<Tienda, List<Producto>> listaCompras) {
		this.listaCompras = listaCompras;
	}

	public void comprarProducto(Tienda tienda) {
		Producto producto = tienda.venderProducto();
		if (producto != null) {
			listaCompras.computeIfAbsent(tienda, k -> new ArrayList<>()).add(producto);
		}
	}

	public double gastoTotal() {
		double total = 0;
		for (List<Producto> productos : listaCompras.values()) {
			for (Producto p : productos) {
				total += p.getPrecio();
			}
		}
		return total;
	}
}
