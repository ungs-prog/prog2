package ungs.prog2.tda;

import java.util.Deque;
import java.util.LinkedList;

public class ColaInt {

    private Deque<Integer> elems;

    public ColaInt() {
        elems = new LinkedList<>();
    }

    public void encolar(int x) {
        elems.addLast(x);
    }

    public int desencolar() {
        return elems.removeFirst();
    }

    public int primero() {
        return elems.peekFirst();
    }

    public boolean vacia() {
        return elems.isEmpty();
    }
}
