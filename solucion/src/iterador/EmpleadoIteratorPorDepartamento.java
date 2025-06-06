package iterador;

import modelo.Empleado;
import coleccion.Empresa;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoIteratorPorDepartamento implements Iterator {
    private List<Empleado> porDepartamento;
    private int posicion = 0;

    public EmpleadoIteratorPorDepartamento(Empresa empresa, String departamento) {
        this.porDepartamento = new ArrayList<>();
        for (Empleado e : empresa.getEmpleados()) {
            if (e.getDepartamento().equalsIgnoreCase(departamento)) {
                porDepartamento.add(e);
            }
        }
    }

    @Override
    public boolean hasMore() {
        return posicion < porDepartamento.size();
    }

    @Override
    public Empleado getNext() {
        if (!hasMore()) return null;
        return porDepartamento.get(posicion++);
    }
}
