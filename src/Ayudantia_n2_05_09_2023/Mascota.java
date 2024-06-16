package Ayudantia_n2_05_09_2023;
public class Mascota {
    private String nombre;
    private int edad;
    private String especie;
    private Duenio duenio;
    private boolean alta;

    public Mascota(String nombre, int edad, String especie, Duenio duenio) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.duenio = duenio;
        this.alta = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }
}
