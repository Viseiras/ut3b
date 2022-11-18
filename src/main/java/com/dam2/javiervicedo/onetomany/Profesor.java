package com.dam2.javiervicedo.onetomany;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "profesores")
public class Profesor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre")
    private String nom;
    @Column
    private double salario;
    @OneToMany(mappedBy = "profesor")// Se refiere al atributo al que se corresponde
    private List<Alumno> alumnos;

    public Profesor(){ }

    public Profesor(String nom, double salario, List<Alumno> alumnos) {
        this.nom = nom;
        this.salario = salario;
        this.alumnos = alumnos;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    // Se tendrá que solucionar porque va a hacer un bucle
    @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", salario=" + salario +
                ", alumnos=" + alumnos +
                '}';
    }
}
