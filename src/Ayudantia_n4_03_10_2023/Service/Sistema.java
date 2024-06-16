package Ayudantia_n4_03_10_2023.Service;

import Ayudantia_n4_03_10_2023.Model.Ciudadano;

public interface Sistema {
    String ingresarCiudadano(Ciudadano ciudadano);
    String modificarCiudadano(int posicion, String nombre);
    String eliminarCiudadano(int posicion);
    int buscarCiudadano(String rutBuscado);
    String desplegarInformacion(int posicion);
}
