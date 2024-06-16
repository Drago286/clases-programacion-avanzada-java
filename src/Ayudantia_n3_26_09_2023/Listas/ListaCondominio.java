package Ayudantia_n3_26_09_2023.Listas;


import Ayudantia_n3_26_09_2023.Objetos.Condominio;
import edu.princeton.cs.stdlib.StdOut;

public class ListaCondominio {
    private Condominio [] listaCondominio;
    private int cantidadMax;
    private int cantidadActual;

    public ListaCondominio(int cantidadMax) {
        if(cantidadMax <= 0){
            StdOut.println("La cantidad maxima no puedes ser menor o igual a 0!");
        }else {
            this.listaCondominio = new Condominio[cantidadMax];
            this.cantidadMax = cantidadMax;
            this.cantidadActual = 0;
        }

    }

    public Condominio[] getListaCondominio() {
        return listaCondominio;
    }

    public void setListaCondominio(Condominio[] listaCondominio) {
        this.listaCondominio = listaCondominio;
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
    public void ingresarCondominio(Condominio condominio){
        if (this.cantidadActual == this.cantidadMax){
            StdOut.println("La base de datos esta llena!");
        }else {
            this.listaCondominio[cantidadActual] = condominio;
            this.cantidadActual++;
        }

    }
    public int buscarCondominio(String nombre){
        if (this.cantidadActual==0){
            StdOut.println("No hay condominios ingresadss!");
        }else{
            for (int i = 0; i < this.cantidadActual; i++) {
                if (this.listaCondominio != null){
                    if (this.listaCondominio[i].getNombre().equalsIgnoreCase(nombre)){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
