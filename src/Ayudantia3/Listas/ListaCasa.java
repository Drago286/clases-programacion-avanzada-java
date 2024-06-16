package Ayudantia3.Listas;

import Ayudantia3.Objetos.Casa;
import Ayudantia3.Objetos.Huesped;
import edu.princeton.cs.stdlib.StdOut;

public class ListaCasa {
    private int cantidadMax;
    private int cantActual;
    private Casa[] listaCasas;

    public ListaCasa(int cantidadMax) {
        this.cantidadMax = cantidadMax;
        this.cantActual = 0;
        this.listaCasas = new Casa[cantidadMax];
    }

    public int getCantidadMax() {
        return cantidadMax;
    }

    public void setCantidadMax(int cantidadMax) {
        this.cantidadMax = cantidadMax;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }

    public Casa[] getListaCasas() {
        return listaCasas;
    }

    public void setListaCasas(Casa[] listaCasas) {
        this.listaCasas = listaCasas;
    }

    public void insertarHuesped(Casa nuevaCasa){
        if (this.cantActual == this.cantidadMax){
            StdOut.println("La lista esta llena!");
        }else {
            this.listaCasas[this.cantActual]=nuevaCasa;
            this.cantActual++;
        }
    }
}
