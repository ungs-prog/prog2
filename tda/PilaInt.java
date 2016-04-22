package ungs.prog2.tda;

import java.util.Deque;
import java.util.LinkedList;

public class PilaInt {

    private Deque<Integer> elems;

    public PilaInt() {
        elems = new LinkedList<>();
    }

    public void apilar(int x) {
        elems.addFirst(x);
    }

    public int desapilar() {
        return elems.removeFirst();
    }

    public int tope() {
        return elems.peekFirst();
    }

    public boolean vacia() {
        return elems.isEmpty();
    }
}
