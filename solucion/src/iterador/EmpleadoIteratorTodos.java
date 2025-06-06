package iterador;

import modelo.Empleado;
import coleccion.Empresa;

import java.util.List;

public class EmpleadoIteratorTodos implements Iterator {
    private List<Empleado> empleados;
    private int posicion = 0;

    public EmpleadoIteratorTodos(Empresa empresa) {
        this.empleados = empresa.getEmpleados();
    }

    @Override
    public boolean hasMore() {
        return posicion < empleados.size();
    }

    @Override
    public Empleado getNext() {
        if (!hasMore()) {
            return null;
        }
        return empleados.get(posicion++);
    }
}
