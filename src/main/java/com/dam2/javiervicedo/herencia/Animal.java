package com.dam2.javiervicedo.herencia;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@DiscriminatorColumn(name = "especie",discriminatorType = DiscriminatorType.CHAR)
@DiscriminatorValue(value="A")
public class Animal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    @Column
    protected String tipo;


    public Animal(String tipo) {
        this.tipo = tipo;
    }
    public Animal()
    {};


    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
