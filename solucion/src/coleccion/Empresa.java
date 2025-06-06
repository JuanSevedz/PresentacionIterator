package coleccion;
import modelo.Empleado;
import iterador.*;

import java.util.ArrayList;
import java.util.List;

public class Empresa implements IterableCollection {
    private List<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public Iterator createIterator(String tipo) {
        switch (tipo.toLowerCase()) {
            case "todos":
                return new EmpleadoIteratorTodos(this);
            case "activos":
                return new EmpleadoIteratorActivos(this);
            case "antiguedad":
                return new EmpleadoIteratorPorAntiguedad(this);
            case "ti": // ejemplo: "ti", "ventas", etc.
            case "ventas":
            case "rrhh":
                return new EmpleadoIteratorPorDepartamento(this, tipo);
            default:
                throw new IllegalArgumentException("Tipo de iterador no válido: " + tipo);
        }
    }
}
