package Ayudantia3.Listas;

import Ayudantia3.Objetos.Condominio;
import Ayudantia3.Objetos.Huesped;
import edu.princeton.cs.stdlib.StdOut;

public class ListaHuesped {
    private int cantidadMax;
    private int cantidadActual;
    private Huesped [] listaHuesped;

    public ListaHuesped(int cantidadMax) {

        this.cantidadMax = cantidadMax;
        this.cantidadActual = 0;
        this.listaHuesped = new Huesped[cantidadMax];
    }

    public int getCantidadMax() {
        return cantidadMax;
    }

    public void setCantidadMax(int cantidadMax) {
        this.cantidadMax = cantidadMax;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public Huesped[] getListaHuesped() {
        return listaHuesped;
    }

    public void setListaHuesped(Huesped[] listaHuesped) {
        this.listaHuesped = listaHuesped;
    }
    public void insertarHuesped(Huesped huesped){
        if (this.cantidadActual == this.cantidadMax){
            StdOut.println("La lista esta llena!");
        }else {
            this.listaHuesped[this.cantidadActual]=huesped;
            this.cantidadActual++;
        }
    }
}
