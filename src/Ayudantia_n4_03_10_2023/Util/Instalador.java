package Ayudantia_n4_03_10_2023.Util;

import Ayudantia_n4_03_10_2023.Service.Sistema;
import Ayudantia_n4_03_10_2023.Service.SistemaImpl;

public class Instalador {
    private final Sistema sistema;

    public Instalador() {
        this.sistema = new SistemaImpl();
    }
    public Sistema InyectorSistema(){
        return this.sistema;
    }
}
