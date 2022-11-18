package com.dam2.javiervicedo.manytomany;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Modulos")
public class Modulo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre")
    private String nom;
    @Column
    private int horas;
    @ManyToMany(cascade = CascadeType.PERSIST)// Se refiere al atributo al que se corresponde
    @JoinTable(name = "modulo estudiante", joinColumns = {@JoinColumn(name = "FK_modulo",referencedColumnName = "id")}, inverseJoinColumns = {@JoinColumn(name = "FK_estudiante",referencedColumnName = "id")})
    private List<Estudiante> estudiantes;

    public Modulo(){ }

    public Modulo(String nom, int horas, List<Estudiante> estudiantes) {
        this.nom = nom;
        this.horas = horas;
        this.estudiantes = estudiantes;
    }

    public int getId() {
        return id;
    }

    /*public void setId(int id) {
        this.id = id;
    }*/

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public List<Estudiante> getAlumnos() {
        return estudiantes;
    }

    public void setAlumnos(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    // Se tendrá que solucionar porque va a hacer un bucle
    @Override
    public String toString() {
        return "Módulo{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", salario=" + horas +
                ", alumnos=" + estudiantes +
                '}';
    }
}
