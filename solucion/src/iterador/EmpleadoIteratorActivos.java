package iterador;

import modelo.Empleado;
import coleccion.Empresa;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoIteratorActivos implements Iterator {
    private List<Empleado> activos;
    private int posicion = 0;

    public EmpleadoIteratorActivos(Empresa empresa) {
        this.activos = new ArrayList<>();
        for (Empleado e : empresa.getEmpleados()) {
            if (e.isActivo()) {
                activos.add(e);
            }
        }
    }

    @Override
    public boolean hasMore() {
        return posicion < activos.size();
    }

    @Override
    public Empleado getNext() {
        if (!hasMore()) return null;
        return activos.get(posicion++);
    }
}
