package Reto1;

import java.util.*;

import Clases.Cliente;
import Clases.Producto;
import Clases.Tienda;

public class Funciones1 {
    public static HashMap<Tienda, List<Producto>> productosComprados;

    public static void mostrarTodasLasTiendas(List<Tienda> tiendas) {
        System.out.println("\n=== Lista de Tiendas ===");
        for (Tienda tienda : tiendas) {
            System.out.println(tienda);
        }
    }

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
                System.out.println("ID no valido. Intentelo de nuevo.");
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
        List<Producto> productos = new ArrayList<>();
        if (productosComprados == null){
            productosComprados = new HashMap<>();
        }

        Producto productoComprado = tienda.getListaProductos().remove(random.nextInt(tienda.getListaProductos().size()));
        cliente.comprarProducto(tienda, productoComprado);

        productos.add(productoComprado);

        productosComprados.put(tienda, productos);

        System.out.println("Ha comprado: " + productoComprado.getNombre() + " por " + Math.round(productoComprado.getPrecio()*100)/100.0 + " euros.");

        if (tienda.getListaProductos().size() < 5) {
            tienda.reponerProductos(5);
            System.out.println("Se han repuesto 5 productos en la tienda " + tienda.getNombre());
        }
    }
}
	


