package ar.edu.utnfc.backend;

public class Repositorio {
    private String nombre;
    private int cantidadEstrellas;
    private boolean publico;   
    
    public Repositorio(String nombre, int cantidadEstrellas, boolean publico){
        this.nombre = nombre;
        this.cantidadEstrellas = cantidadEstrellas;
        this.publico = publico;
    }

    public String getNombre(){
        return nombre;
    }

    public int getCantEstrellas(){
        return cantidadEstrellas;
    }

    public boolean getPublico(){
        return publico;
    }

    public boolean esPopular(){
        return cantidadEstrellas >= 100;
    }

    public void setCantEstrellas(int cantidadEstrellas){
        if (cantidadEstrellas >= 0){
            this.cantidadEstrellas = cantidadEstrellas;
        }
    }

}
