package Ayudantia_n4_03_10_2023.Service;

import Ayudantia_n4_03_10_2023.Model.Ciudadano;
import Ayudantia_n4_03_10_2023.Model.ListaCiudadano;

public class SistemaImpl implements Sistema {

    ListaCiudadano listaCiudadano = new ListaCiudadano(10);
    @Override
    public String ingresarCiudadano(Ciudadano ciudadano) {
       if(this.listaCiudadano.insertar(ciudadano)){
           return "Ciudadano ingresado correctamente";
       }

        return "Ocurrio un error durante el registro.";
    }

    @Override
    public String modificarCiudadano(int posicion, String nombre) {
        this.listaCiudadano.getListaCiudadano()[posicion].setNombre(nombre);
        return this.listaCiudadano.getListaCiudadano()[posicion].toString();
    }

    @Override
    public String eliminarCiudadano(int posicion) {

       if (this.listaCiudadano.eliminar(this.listaCiudadano.getListaCiudadano()[posicion])){
           return "Ciudadano eliminado correctamente!";
       }else {
           return "Ocurrio un error durante la eliminacion";
       }

    }

    @Override
    public int buscarCiudadano(String rutBuscado) {
        return this.listaCiudadano.buscar(rutBuscado);
    }

    @Override
    public String desplegarInformacion(int posicion) {
        return this.listaCiudadano.getListaCiudadano()[posicion].toString();
    }
}
