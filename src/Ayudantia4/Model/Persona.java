package Ayudantia4.Model;

public class Persona {
    private String RUT;
    private String fechaNacimiento;
    private String nombre;

    public Persona(String RUT, String fechaNacimiento, String nombre) {
        this.RUT = RUT;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
    }

    public String getRUT() {
        return RUT;
    }

    public void setRUT(String RUT) {
        this.RUT = RUT;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "RUT='" + RUT + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
