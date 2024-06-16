package Ayudantia_n3_26_09_2023.Listas;

import Ayudantia_n3_26_09_2023.Objetos.Casa;
import edu.princeton.cs.stdlib.StdOut;

public class ListaCasa {
    private Casa[] listaCasas;
    private int cantidadMax;
    private int cantidadActual;

    public ListaCasa(int cantidadMax) {
        if(cantidadMax<=0){
            StdOut.println("La cantidad maxima no puede ser menor o igual a 0!");
        }else {
            this.cantidadMax = cantidadMax;
            this.cantidadActual=0;
            this.listaCasas = new Casa[cantidadMax];
        }

    }

    public Casa[] getListaCasas() {
        return listaCasas;
    }

    public void setListaCasas(Casa[] listaCasas) {
        this.listaCasas = listaCasas;
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

    public void ingresarCasa(Casa casa){
        if (this.cantidadActual == this.cantidadMax){
            StdOut.println("La base de datos esta llena!");
        }else {
            this.listaCasas[cantidadActual] = casa;
            this.cantidadActual++;
        }

    }
    public int buscarCasa(int numero){
        if (this.cantidadActual==0){
            StdOut.println("No hay casas ingresadas!");
        }else{
            for (int i = 0; i < this.cantidadActual; i++) {
                if (this.listaCasas != null){
                    if (this.listaCasas[i].getNumero() == numero){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
    public boolean eliminarCasa(int numeroCasa){
        if (this.cantidadActual == 0){
            StdOut.println("No hay casas registradas!");
        }else {
            if (buscarCasa(numeroCasa) != -1){

                this.listaCasas[buscarCasa(numeroCasa)] = null;
                cantidadActual--;
                return true;
            }
        }
        return false;
    }
}

