package com.dam2.javiervicedo.herencia;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="G")
public class Gato extends Animal{
    @Column
    private int vidas;

    public Gato(int vidas)
    {
        this.vidas=vidas;
    }

    public Gato(String tipo, int vidas) {
        super(tipo);
        this.vidas = vidas;
    }

    public Gato() {

    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "vidas=" + vidas +
                ", id=" + id +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
