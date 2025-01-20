package Reto1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Clases.Empleado;
import Clases.Tienda;
import Clases.funciones;

public class Reto1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		List<Empleado> empleados=new ArrayList<>();
		rellenaEmpleados(empleados,r);
		List<Tienda>tiendas=new ArrayList<>();
		rellenaTiendas(tiendas);
		menu(sc);
	}
	
	public static void rellenaEmpleados(List<Empleado> empleados,Random r) {
		for (int i=1;i<21;i++) {
			Empleado empleado=new Empleado();
			empleado.setNombre("Empleado "+i);
			empleado.setAntig((int) r.nextDouble(1,21));
			empleado.setSueldo(empleado.getAntig());
			empleados.add(empleado);
		}
	}
	public static void rellenaTiendas(List<Tienda> tiendas) {
		
	}
	public static void menu (Scanner sc) {
		int opcion=0;
		do
		{
			opcion = funciones.dimeEntero("1 - Ver tiendas\r\n"
					+ "2 - Comprar\r\n"
					+ "3 - Mostrar compras\r\n"
					+ "4 - Realizar una queja\r\n"
					+ "5 - Salir\r\n",sc);
			switch(opcion)
			{
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
			
				break;
			}
		}while(opcion!=5);

	}
	}

