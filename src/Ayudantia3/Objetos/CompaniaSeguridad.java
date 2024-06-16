package Ayudantia3.Objetos;

import Ayudantia3.Listas.ListaCondominio;



public class CompaniaSeguridad {
    private int precio;
    private String direccion;
    private ListaCondominio listaCondominio;

    public CompaniaSeguridad(int precio, String direccion, int cantidadCondominios) {
        this.precio = precio;
        this.direccion = direccion;
        this.listaCondominio = new ListaCondominio(cantidadCondominios);
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ListaCondominio getListaCondominio() {
        return listaCondominio;
    }

    public void setListaCondominio(ListaCondominio listaCondominio) {
        this.listaCondominio = listaCondominio;
    }
}
