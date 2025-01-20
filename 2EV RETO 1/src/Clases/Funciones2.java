package Clases;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Funciones2 {
    public static void mostrarCompras(List<Producto> productos, Tienda tienda){
        System.out.printf("Comprado en tienda: %s%n- Cantidad: %d%n",
                tienda.getNombre(), productos.size());
        double total = 0.0;
        for (Producto p : productos){
            total += p.getPrecio();
        }
        System.out.printf("Total a pagar: %.2f", total);
    }

    public static void realizarQueja(List<Tienda> tiendas, List<Empleado> empleados){
        Scanner sn = new Scanner(System.in);
        Random r = new Random();
        int opcion;
        Tienda tienda;
        do {
            for (Tienda t : tiendas){
                System.out.printf("ID: %d - Tienda: %s", t.getId(), t.getNombre());
            }
            opcion = funciones.dimeEntero("Elija tienda: ", sn);
        } while (buscarTienda(opcion, tiendas) == null);
        tienda = buscarTienda(opcion, tiendas);
        tienda.setEmpleado(empleados.get(r.nextInt(0, empleados.size())));
        System.out.println("Gerente cambiado, tenga un buen dia.");
    }

    public static Tienda buscarTienda(int id, List<Tienda> tiendas){
        for (Tienda t : tiendas){
            if (t.getId() == id){
                return t;
            }
        }
        return null;
    }
}
