import edu.princeton.cs.stdlib.StdOut;

public class ListaCircular {
    private Nodo cabeza;

    public ListaCircular() {
        this.cabeza = null;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
    public void insertar(Cancion cancion){
        Nodo nuevoNodo = new Nodo(cancion);
        if (this.cabeza == null){
            this.cabeza = nuevoNodo;
            this.cabeza.setSiguiente(this.cabeza);
            this.cabeza.setAnterior(this.cabeza);
        }else{
            Nodo ultimo = this.cabeza.getAnterior();
            ultimo.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(this.cabeza);
            this.cabeza.setAnterior(nuevoNodo);
            nuevoNodo.setAnterior(ultimo);
        }
    }

    public void eliminar(String dato){
        if (cabeza == null) {
            System.out.println("La lista está vacía. No se puede eliminar.");
            return;
        }

        Nodo nodoActual = cabeza;
        while (nodoActual != cabeza || nodoActual.getSiguiente() != null) {
            if (nodoActual.getCancion().equals(dato)) {
                if (cabeza.getSiguiente() == cabeza) {
                    cabeza = null;
                    return;
                }

                Nodo nodoAnterior = nodoActual.getAnterior();
                Nodo nodoSiguiente = nodoActual.getSiguiente();

                nodoAnterior.setSiguiente(nodoSiguiente);
                nodoSiguiente.setAnterior(nodoAnterior);

                if (nodoActual == cabeza) {
                    cabeza = nodoSiguiente;
                }

                System.out.println("Nodo eliminado.");
                return;
            }
            nodoActual = nodoActual.getSiguiente();
        }

        System.out.println("El dato no se encontró en la lista.");
    }
    public void imprimirLista(){
        if (this.cabeza == null){
            StdOut.println("La lista esta vacia");
            return;
        }
        else {
            Nodo actual = this.cabeza;
            while (true){
                StdOut.println(actual.toString());
                actual = actual.getSiguiente();

                if (actual == this.cabeza){
                    break;
                }
            }
        }
    }
}
