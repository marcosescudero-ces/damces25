package Segundotrimestre.pokemon;

import java.util.Arrays;

public class pokemonPOO {

    private String nombre;

    private String tipo;

    private int vida;

    private int[] potencia = new int[4];

    private String[] ataque = new String[4];

    private String color;

    public pokemonPOO(String nombre, String tipo, int vida, int[] potencia, String[] ataque, String color) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.potencia = potencia;
        this.ataque = ataque;
        this.color = color;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int[] getPotencia() {
        return potencia;
    }

    public void setPotencia(int[] potencia) {
        this.potencia = potencia;
    }

    public String[] getAtaque() {
        return ataque;
    }

    public void setAtaque(String[] ataque) {
        this.ataque = ataque;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "pokemonPOO{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", vida=" + vida +
                ", potencia=" + Arrays.toString(potencia) +
                ", ataque=" + Arrays.toString(ataque) +
                ", color='" + color + '\'' +
                '}';
    }
}
