package iterador;

import modelo.Empleado;
import coleccion.Empresa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmpleadoIteratorPorAntiguedad implements Iterator {
    private List<Empleado> ordenados;
    private int posicion = 0;

    public EmpleadoIteratorPorAntiguedad(Empresa empresa) {
        this.ordenados = new ArrayList<>(empresa.getEmpleados());
        this.ordenados.sort(Comparator.comparing(Empleado::getFechaIngreso));
    }

    @Override
    public boolean hasMore() {
        return posicion < ordenados.size();
    }

    @Override
    public Empleado getNext() {
        if (!hasMore()) return null;
        return ordenados.get(posicion++);
    }
}
