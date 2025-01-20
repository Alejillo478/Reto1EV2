package Clases;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cliente {
	private String nombre;
	private Map<Tienda,List<Producto>> listaCompras;
	public Cliente() {
		this.listaCompras=new HashMap<>();
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
	public void addProducto(Producto p) {
		
	}
	public void addCompra(Tienda t, Producto p) {
		
	}
	
}
