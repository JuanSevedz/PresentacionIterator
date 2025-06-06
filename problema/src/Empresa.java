import java.util.*;
import java.util.stream.Collectors;

public class Empresa {
    private List<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public List<Empleado> listarTodos() {
        return empleados;
    }

    public List<Empleado> listarActivos() {
        return empleados.stream()
                        .filter(Empleado::isActivo)
                        .collect(Collectors.toList());
    }

    public List<Empleado> listarPorDepartamento(String depto) {
        return empleados.stream()
                        .filter(e -> e.getDepartamento().equalsIgnoreCase(depto))
                        .collect(Collectors.toList());
    }

    public List<Empleado> listarPorAntiguedad() {
        return empleados.stream()
                        .sorted(Comparator.comparing(Empleado::getFechaIngreso))
                        .collect(Collectors.toList());
    }
}
