package Clases;

public class Estudiante {
    // atributos
    private String nombre;
    private int edad;

    // constructor
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // gets y sets
    // considere que los sets son unicamente validos para aquellas variables que si pueden cambiar durante la ejecucion del programa

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
}
