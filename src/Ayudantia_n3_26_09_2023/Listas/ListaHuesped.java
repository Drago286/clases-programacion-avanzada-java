package Ayudantia_n3_26_09_2023.Listas;

import Ayudantia_n3_26_09_2023.Objetos.Condominio;
import Ayudantia_n3_26_09_2023.Objetos.Huesped;
import edu.princeton.cs.stdlib.StdOut;

public class ListaHuesped {
    private int cantidadMax;
    private int cantidadActual;
    private Huesped[] listaHuespedes;

    public ListaHuesped(int cantidadMax) {
        if (cantidadMax <= 0){
            StdOut.println("La cantidad maxima no puedes ser menor o igual a 0!");
        }else{
            this.cantidadMax = cantidadMax;
            this.cantidadActual = 0;
            this.listaHuespedes = new Huesped[cantidadMax];

        }

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

    public Huesped[] getListaHuespedes() {
        return listaHuespedes;
    }

    public void setListaHuespedes(Huesped[] listaHuespedes) {
        this.listaHuespedes = listaHuespedes;
    }

    public void ingresarHuesped(Huesped huesped){
        if (this.cantidadActual == this.cantidadMax){
            StdOut.println("La base de datos esta llena!");
        }else {
            this.listaHuespedes[cantidadActual] = huesped;
            this.cantidadActual++;
        }

    }
    public int buscarHuesped(String nombre){
        if (this.cantidadActual==0){
            StdOut.println("No hay condominios ingresadss!");
        }else{
            for (int i = 0; i < this.cantidadActual; i++) {
                if (this.listaHuespedes != null){
                    if (this.listaHuespedes[i].getNombre().equalsIgnoreCase(nombre)){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
