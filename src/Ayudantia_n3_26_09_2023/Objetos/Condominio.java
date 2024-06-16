package Ayudantia_n3_26_09_2023.Objetos;

import Ayudantia_n3_26_09_2023.Listas.ListaCasa;

public class Condominio {

    private String nombre;
    private String direccion;
    private ListaCasa listaCasas;

    public Condominio(String direccion,String nombre, int cantidadMax) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.listaCasas = new ListaCasa(cantidadMax);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ListaCasa getListaCasas() {
        return listaCasas;
    }

    public void setListaCasas(ListaCasa listaCasas) {
        this.listaCasas = listaCasas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
