package com.dam2.javiervicedo.hibernameesta;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "colonias")
public class Colonia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre;
    @Column
    private int poblacion;
    @OneToMany(mappedBy = "colonia")
    private List<Hormiga> hormigas;

    public Colonia(int id, String nombre, int poblacion, List<Hormiga> hormigas) {
        this.id = id;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.hormigas = hormigas;
    }

    public Colonia() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public List<Hormiga> getHormigas() {
        return hormigas;
    }

    public void setHormigas(List<Hormiga> colonia) {
        this.hormigas = colonia;
    }

    @Override
    public String toString() {
        return "Colonia{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", poblacion=" + poblacion +
                ", hormigas=" + hormigas +
                '}';
    }
}
