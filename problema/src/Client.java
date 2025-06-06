import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.agregarEmpleado(new Empleado("Ana", "TI", LocalDate.of(2015, 1, 15), true));
        empresa.agregarEmpleado(new Empleado("Luis", "Ventas", LocalDate.of(2019, 5, 10), false));
        empresa.agregarEmpleado(new Empleado("Carlos", "TI", LocalDate.of(2010, 7, 20), true));

        System.out.println("=== Todos los empleados ===");
        for (Empleado e : empresa.listarTodos()) {
            System.out.println(e);
        }

        System.out.println("\n=== Empleados Activos ===");
        for (Empleado e : empresa.listarActivos()) {
            System.out.println(e);
        }

        System.out.println("\n=== Departamento TI ===");
        for (Empleado e : empresa.listarPorDepartamento("TI")) {
            System.out.println(e);
        }

        System.out.println("\n=== Por Antigüedad ===");
        for (Empleado e : empresa.listarPorAntiguedad()) {
            System.out.println(e);
        }
    }
}
