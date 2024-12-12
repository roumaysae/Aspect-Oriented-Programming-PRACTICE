package com.roumaysae.METIER;

public class Compte {
    private Long code;
    private double solde;

    public Compte(Long code, double solde) {
        this.code = code;
        this.solde = solde;
    }

    public Compte() {

    }

    public Long getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

}
