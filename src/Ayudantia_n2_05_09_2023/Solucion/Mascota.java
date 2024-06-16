package Ayudantia_n2_05_09_2023.Solucion;

public class Mascota {

    private String nombre;
    private String especie;
    private int edad;
    private boolean alta;
    private Duenio duenio;

    public Mascota(String nombre, String especie, int edad, Duenio duenio) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.alta = false;
        this.duenio = duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", alta=" + alta +
                '}';
    }
}
