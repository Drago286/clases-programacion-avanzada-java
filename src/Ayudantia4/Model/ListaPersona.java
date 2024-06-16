package Ayudantia4.Model;



public class ListaPersona {
    private Persona[] listaPersona;
    private int cantidadMax;
    private int cantActual;

    public ListaPersona(int cantidadMax) {
        this.cantidadMax = cantidadMax;
        this.cantActual = 0;
        this.listaPersona = new Persona[cantidadMax];

    }

    public Persona[] getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(Persona[] listaPersona) {
        this.listaPersona = listaPersona;
    }

    public int getCantidadMax() {
        return cantidadMax;
    }

    public void setCantidadMax(int cantidadMax) {
        this.cantidadMax = cantidadMax;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }
    public boolean insertar(Persona persona){
        if (this.cantidadMax == this.cantActual){
            return false;
        }else {
            this.listaPersona[this.cantActual]=persona;
            this.cantActual++;
            return true;
        }
    }
    public Persona buscar(String rut){
        if (this.cantActual > 0){
            for (int i = 0; i < this.cantidadMax; i++) {
                if(this.listaPersona[i] != null){
                    if (this.listaPersona[i].getRUT().equals(rut)){
                        return this.listaPersona[i];
                    }
                }
            }
        }
        return null;
    }
    public int buscarPosicion(String rut){
        if (this.cantActual > 0){
            for (int i = 0; i < this.cantidadMax; i++) {
                if(this.listaPersona[i] != null){
                    if (this.listaPersona[i].getRUT().equals(rut)){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
