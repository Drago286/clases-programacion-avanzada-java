package Ayudantia3.Objetos;

import Ayudantia3.Listas.ListaCasa;

public class Condominio {

    private String direccion;
    private ListaCasa listaCasa;

    public Condominio(String direccion, int cantidadDeCasas) {
        this.direccion = direccion;
        this.listaCasa = new ListaCasa(cantidadDeCasas);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ListaCasa getListaCasa() {
        return listaCasa;
    }

    public void setListaCasa(ListaCasa listaCasa) {
        this.listaCasa = listaCasa;
    }
}
