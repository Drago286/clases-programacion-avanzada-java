package Ayudantia4.Service;

import Ayudantia4.Model.ListaPersona;
import Ayudantia4.Model.Persona;

public class SistemaImpl implements Sistema{

    ListaPersona listaPersona = new ListaPersona(10);
    @Override
    public String ingresarPersona(Persona persona) {
        if (this.listaPersona.insertar(persona)){
            return "Persona ingresada correctamente!";
        }else {
            return "Ocurrio un error durante la agregacion";
        }
    }

    @Override
    public String modificarPersona(int posicion, String nombre) {

        this.listaPersona.getListaPersona()[posicion].setNombre(nombre);
        return this.listaPersona.getListaPersona()[posicion].toString();
    }

    @Override
    public String eliminarPersona(int posicion) {
       this.listaPersona.getListaPersona()[posicion] = null;
       return "Persona eliminada!";
    }

    @Override
    public int buscarPersona(String rutBuscado) {
        return this.listaPersona.buscarPosicion(rutBuscado);
    }

    @Override
    public String desplegarInformacion(int posicion) {
        return this.listaPersona.getListaPersona()[posicion].toString();
    }



}
