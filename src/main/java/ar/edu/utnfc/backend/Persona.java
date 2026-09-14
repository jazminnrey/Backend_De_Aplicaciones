package ar.edu.utnfc.backend;

public class Persona {
    private String nombre;
    private int edad;
    private double altura;

    public String getNombre() {
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public double getAltura(){
        return altura;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad >= 0){
            this.edad = edad;
        }
    }

    public void setAltura(double altura){
        if (altura > 0){
            this.altura = altura;
        }
    }

    public void saludar() {
       System.out.println("Hola, soy " + nombre);
    }

    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
}