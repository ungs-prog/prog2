package ungs.prog2.abb;

public class ListaIntRec extends ListaInt
{
    @Override
    protected int largoAux(Nodo nodo) {
        return -1;
    }

    @Override
    protected void agregarAux(Nodo nodo, Integer x) {
    }

    @Override
    protected Integer eliminarUltimoAux(Nodo anterior, Nodo actual) {
        return null;
    }
}
