package iterador;

import modelo.Empleado;

public interface Iterator {
    boolean hasMore();
    Empleado getNext();
}
