package Ayudantia3.Listas;

import Ayudantia3.Objetos.Condominio;
import edu.princeton.cs.stdlib.StdOut;

public class ListaCondominio {
    private int cantidadMax;
    private int cantidadActual;
    private Condominio[] listaCondominio;

    public ListaCondominio(int cantidadMax) {
        this.cantidadMax = cantidadMax;
        this.cantidadActual = 0;
        this.listaCondominio = new Condominio[cantidadActual];
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

    public Condominio[] getListaCondominio() {
        return listaCondominio;
    }

    public void setListaCondominio(Condominio[] listaCondominio) {
        this.listaCondominio = listaCondominio;
    }
    public void insertarCondominio(Condominio condominio){
        if (this.cantidadActual == this.cantidadMax){
            StdOut.println("La lista esta llena!");
        }else {
            this.listaCondominio[this.cantidadActual]=condominio;
            this.cantidadActual++;
        }
    }
    public int buscarCondominio(String nombreCondominio){
        if (this.cantidadActual>0){
            for (int i = 0; i < this.cantidadMax; i++) {
                if (this.listaCondominio[i] != null){
                    if (this.listaCondominio[i].getDireccion().equals(nombreCondominio)){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
