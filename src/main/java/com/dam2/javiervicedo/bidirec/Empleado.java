package com.dam2.javiervicedo.bidirec;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="employees")

public class Empleado implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nombre")
    private String nom;
    @Column
    private double salario;
    @Transient
    private String comentario;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="FK_usuario",referencedColumnName = "id")
    private Usuario usuario;

    public Empleado() {

    }

    public Empleado(String nom, double salario,Usuario usuario) {
        this.nom = nom;
        this.salario = salario;
        this.usuario=usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Usuario getUsuario(){return usuario;}

    public void setUsuario(Usuario usuario){this.usuario=usuario;}

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", salario=" + salario +
                ", comentario='" + comentario + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
