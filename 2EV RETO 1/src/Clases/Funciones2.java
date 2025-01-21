package Clases;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Funciones2 {
    public static void mostrarCompras(Cliente cliente){
        HashMap<Tienda, List<Producto>> compra = cliente.getListaCompras();
        double total = 0.0;
        for (List<Producto> productos : compra.values()){
           for (Producto p : productos){
               System.out.println(p);
               total += p.getPrecio();
           }
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
            tienda = buscarTienda(opcion, tiendas);
        } while (buscarTienda(opcion, tiendas) == null);
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
