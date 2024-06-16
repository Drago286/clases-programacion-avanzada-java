package Ayudantia_n4_03_10_2023.Model;

import edu.princeton.cs.stdlib.StdOut;

public class ListaCiudadano {
    private Ciudadano[] listaCiudadano;
    private int cantidadMax;
    private int cantidadActual;

    public ListaCiudadano(int cantidadMax) {
        this.cantidadMax = cantidadMax;
        this.cantidadActual = 0;
        this.listaCiudadano = new Ciudadano[cantidadMax];
    }
    public boolean insertar(Ciudadano nuevoCiudadano){
        if (this.cantidadActual == this.cantidadMax){
            StdOut.println("la lista esta llena!");
            return false;
        }else {
            this.listaCiudadano[this.cantidadActual] = nuevoCiudadano;
            this.cantidadActual++;
            return true;
        }
    }
    public boolean modificar(Ciudadano ciudadano){
        if (this.cantidadActual > 0 ){
            int posicion = buscar(ciudadano.getRUT());
            if (posicion!= -1){
                this.listaCiudadano[posicion]=ciudadano;
                return true;
            }
        }
        return false;
    }
    public boolean eliminar(Ciudadano ciudadano){
        if (this.cantidadActual > 0 ){
            int posicion = buscar(ciudadano.getRUT());
            if (posicion!= -1){
                this.listaCiudadano[posicion]=null;
                return true;
            }
        }
        return false;
    }
    public int buscar(String RUT){
        if (this.cantidadActual>0){
            for (int i = 0; i < this.cantidadMax; i++) {
                if (this.listaCiudadano[i] != null){
                    if (this.listaCiudadano[i].getRUT().equals(RUT)){
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public Ciudadano[] getListaCiudadano() {
        return listaCiudadano;
    }

    public void setListaCiudadano(Ciudadano[] listaCiudadano) {
        this.listaCiudadano = listaCiudadano;
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
}
