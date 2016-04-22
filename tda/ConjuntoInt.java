package ungs.prog2.tda;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoInt implements Iterable<Integer> {

    private Set<Integer> elems;

    public ConjuntoInt() {
        elems = new TreeSet<>();
    }

    public boolean agregar(int x) {
        return elems.add(x);
    }

    public boolean pertenece(int x) {
        return elems.contains(x);
    }

    public boolean eliminar(int x) {
        return elems.remove(x);
    }

    public boolean vacio() {
        return elems.isEmpty();
    }

    public int tamaño() {
        return elems.size();
    }

    public Iterator<Integer> iterator() {
        return elems.iterator();
    }
}
