package Ayudantia4.Service;

import Ayudantia4.Model.Persona;

public interface Sistema {
    String ingresarPersona(Persona persona);
    String modificarPersona(int posicion, String nombre);
    String eliminarPersona(int posicion);
    int buscarPersona(String rutBuscado);
    String desplegarInformacion(int posicion);

}
