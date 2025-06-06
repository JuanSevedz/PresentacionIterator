package cliente;

import coleccion.Empresa;
import iterador.Iterator;
import modelo.Empleado;

import java.time.LocalDate;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        // Datos de prueba
        empresa.agregarEmpleado(new Empleado("Ana", "TI", LocalDate.of(2015, 1, 15), true));
        empresa.agregarEmpleado(new Empleado("Luis", "Ventas", LocalDate.of(2019, 5, 10), false));
        empresa.agregarEmpleado(new Empleado("Carlos", "TI", LocalDate.of(2010, 7, 20), true));
        empresa.agregarEmpleado(new Empleado("Laura", "RRHH", LocalDate.of(2018, 3, 5), true));

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE CONSULTA DE EMPLEADOS ===");
        System.out.println("Opciones: todos | activos | antiguedad | [nombreDepartamento]");
        System.out.print("Tipo de recorrido: ");
        String tipo = scanner.nextLine().trim().toLowerCase();

        try {
            Iterator iterador = empresa.createIterator(tipo);
            System.out.println("\n--- Resultados ---");
            while (iterador.hasMore()) {
                Empleado e = iterador.getNext();
                System.out.println(e);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
