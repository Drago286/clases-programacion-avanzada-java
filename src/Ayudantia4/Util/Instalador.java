package Ayudantia4.Util;

import Ayudantia4.Service.Sistema;
import Ayudantia4.Service.SistemaImpl;

public class Instalador {
    private final Sistema sistema;

    public Instalador(){
        this.sistema = new SistemaImpl();
    }

    public Sistema InyectorSistema(){
        return this.sistema;
    }

}
