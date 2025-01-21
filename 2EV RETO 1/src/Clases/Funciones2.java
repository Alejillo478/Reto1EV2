package Clases;

import Reto1.Funciones1;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Funciones2 {
    public static void mostrarCompras(){
        double total = 0.0;
        HashMap<Tienda, List<Producto>> mapa = Funciones1.productosComprados;
        for (Tienda t : mapa.keySet()){
               System.out.println("Has comprado estos productos: " + mapa.get(t)+
                       " en la tienda: "+ t.getNombre());
               for (Producto p : mapa.get(t)){
                   total+=p.getPrecio();
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
