package coleccion;

import iterador.Iterator;

public interface IterableCollection {
    Iterator createIterator(String tipo);
}
