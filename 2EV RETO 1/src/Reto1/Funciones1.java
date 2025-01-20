package Reto1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Clases.Empleado;
import Clases.Producto;
import Clases.Tienda;

public class Funciones1 {


	public class Main {
	    public static void main(String[] args) {
	        List<Empleado> empleados = generarEmpleados(20); 
	        List<Tienda> tiendas = generarTiendas(5, empleados); 

	        mostrarTodasLasTiendas(tiendas);
	   }
	}
public static List<Empleado> generarEmpleados(int cantidad) {
	   List<Empleado> empleados = new ArrayList<>();
	   Random random = new Random();
	      for (int i = 0; i < cantidad; i++) {
	          String nombre = "Empleado" + (i + 1); 
	          int antiguedad = 1 + random.nextInt(20); 
	          empleados.add(new Empleado(nombre, antiguedad));
	        }
	        return empleados;
	    }
public static List<Tienda> generarTiendas(int cantidad, List<Empleado> empleados) {
    List<Tienda> tiendas = new ArrayList<>();
    Random random = new Random();

    for (int i = 0; i < cantidad; i++) {
        int id = i + 1; 
        String nombre = "Tienda" + id; 

        Empleado gerente = empleados.get(random.nextInt(empleados.size()));
        Tienda tienda = new Tienda(id, nombre, gerente, new ArrayList<>());
        reponerProductosEnTienda(tienda, 5 + random.nextInt(6)); 
        tiendas.add(tienda);
    }

    return tiendas;
}

public static void reponerProductosEnTienda(Tienda tienda, int cantidad) {
    System.out.println("Reponiendo " + cantidad + " productos en la tienda: " + tienda.getNombre());
    tienda.reponerProductos(cantidad); 
}

public static void mostrarTodasLasTiendas(List<Tienda> tiendas) {
    System.out.println("\n=== Lista de Tiendas ===");
    for (Tienda tienda : tiendas) {
        System.out.println(tienda); 
    	}
	}



// ej 2 

public class Compra {
    
    public static Tienda seleccionarTiendaPorId(List<Tienda> tiendas) {
        Scanner scanner = new Scanner(System.in);
        Tienda tiendaSeleccionada = null;
        
        while (tiendaSeleccionada == null) {
            System.out.println("Listado de tiendas:");
            for (Tienda tienda : tiendas) {
                System.out.println("ID: " + tienda.getId() + " - Nombre: " + tienda.getNombre());
            }
            
            System.out.print("Ingrese el ID de la tienda: ");
            int idSeleccionado = scanner.nextInt();
            
            for (Tienda tienda : tiendas) {
                if (tienda.getId() == idSeleccionado) {
                    tiendaSeleccionada = tienda;
                    break;
                }
            }
            
            if (tiendaSeleccionada == null) {
                System.out.println("ID no válido. Inténtelo de nuevo.");
            }
        }
        
        return tiendaSeleccionada;
    }

    public static void comprarProducto(Tienda tienda, Cliente cliente) {
        if (tienda.getListaProductos().isEmpty()) {
            System.out.println("No hay productos disponibles en esta tienda.");
            return;
        }
        
        Random random = new Random();
        Producto productoComprado = tienda.getListaProductos().remove(random.nextInt(tienda.getListaProductos().size()));
        cliente.comprarProducto(tienda, productoComprado);
        
        System.out.println("Ha comprado: " + productoComprado.getNombre() + " por " + productoComprado.getPrecio() + " euros.");
        
        if (tienda.getListaProductos().size() < 5) {
            tienda.reponerProductos(5);
            System.out.println("Se han repuesto 5 productos en la tienda " + tienda.getNombre());
        }
    }
}

}
	


