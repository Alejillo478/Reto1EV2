package Clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class funciones {
	public static boolean esInt(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean esDouble(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static int dimeEntero(String orden, Scanner sc) {
		do {
			try {
				System.out.println(orden);
				String s = sc.nextLine();
				int n = Integer.parseInt(s);
				return n;

			} catch (Exception e) {
				System.out.println("Formato incorrecto");
			}
		} while (true);
	}

	public static double dimeDouble(String orden, Scanner sc) {
		do {
			try {
				System.out.println(orden);
				String s = sc.nextLine();
				double d = Double.parseDouble(s);
				return d;

			} catch (Exception e) {
				System.out.println("Formato incorrecto");
			}
		} while (true);
	}

	public static String dimeString(String orden, Scanner sc) {
		String s = "";
		do {
			System.out.println(orden);
			s = sc.nextLine();

		} while (s.equals(""));
		return s;
	}

	public static LocalDate dimeFecha(String texto, Scanner sc) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		do {
			try {
				System.out.println(texto);
				String textoFecha = sc.nextLine();
				LocalDate fecha = LocalDate.parse(textoFecha, formato);
				return fecha;

			} catch (Exception e) {
				System.out.println("Fecha no valida");
			}

		} while (true);
	}

	public static void muestraArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(i == 0 ? array[i] : ", " + array[i]);
		}
		System.out.println();
	}

	public static void muestraArrayS(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(i == 0 ? array[i] : ", " + array[i]);
		}
		System.out.println();
	}

	public static void muestraArrayListInt(ArrayList<Integer> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(i == 0 ? lista.get(i) : ", " + lista.get(i));
		}
		System.out.println();
	}

	public static void muestraListaInt(List<Integer> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(i == 0 ? lista.get(i) : ", " + lista.get(i));
		}
		System.out.println();
	}

	public static boolean esPrimo(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
