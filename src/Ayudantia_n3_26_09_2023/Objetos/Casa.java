package Ayudantia_n3_26_09_2023.Objetos;


import Ayudantia_n3_26_09_2023.Listas.ListaHuesped;

public class Casa {
    private int numero;
    private ListaHuesped listaHuespedes;

    public Casa(int numero, int cantidadMax) {
        this.numero = numero;
        this.listaHuespedes = new ListaHuesped(cantidadMax);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ListaHuesped getListaHuespedes() {
        return listaHuespedes;
    }

    public void setListaHuespedes(ListaHuesped listaHuespedes) {
        this.listaHuespedes = listaHuespedes;
    }
}
