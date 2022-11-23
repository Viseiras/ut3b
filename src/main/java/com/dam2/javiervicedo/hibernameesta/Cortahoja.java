package com.dam2.javiervicedo.hibernameesta;

import jakarta.persistence.*;

import java.util.List;

@Entity
@DiscriminatorValue(value = "C")
@Table(name = "cortahojas")
public class Cortahoja extends Hormiga{
    @Column
    private String alimento;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "FK_colonia",referencedColumnName = "id")
    private Colonia colonia;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="FK_vpn",referencedColumnName = "id")
    private Vpn vpn;

    @ManyToMany(cascade = CascadeType.PERSIST,mappedBy = "cortahojas")
    private List<Alimento> alimentos;

    public Cortahoja(int patas, String nombre, String alimento, Colonia colonia, Vpn vpn) {
        super(patas, nombre);
        this.alimento = alimento;
        this.colonia = colonia;
        this.vpn = vpn;
    }

    public Cortahoja() {
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Colonia getColonia() {
        return colonia;
    }

    public void setColonia(Colonia colonia) {
        this.colonia = colonia;
    }

    public Vpn getVpn() {
        return vpn;
    }

    public void setVpn(Vpn vpn) {
        this.vpn = vpn;
    }

    @Override
    public String toString() {
        return "Cortahoja{" +
                "alimento='" + alimento + '\'' +
                ", colonia=" + colonia +
                ", vpn=" + vpn +
                '}';
    }
}
