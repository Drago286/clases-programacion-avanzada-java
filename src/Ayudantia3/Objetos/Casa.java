package Ayudantia3.Objetos;

import Ayudantia3.Listas.ListaHuesped;

public class Casa {
    private int numero;
    private ListaHuesped listaHuesped;

    public Casa(int numero, int cantidadHuespedes) {
        this.numero = numero;
        this.listaHuesped = new ListaHuesped(cantidadHuespedes);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ListaHuesped getListaHuesped() {
        return listaHuesped;
    }

    public void setListaHuesped(ListaHuesped listaHuesped) {
        this.listaHuesped = listaHuesped;
    }
}
