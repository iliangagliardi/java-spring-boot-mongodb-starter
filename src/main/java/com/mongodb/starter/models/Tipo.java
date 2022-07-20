package com.mongodb.starter.models;

public class Tipo {
    public String funz;
    public Prod prod;
    public String tpRC;

    public String getFunz() {
        return funz;
    }

    public void setFunz(String funz) {
        this.funz = funz;
    }

    public Prod getProd() {
        return prod;
    }

    public void setProd(Prod prod) {
        this.prod = prod;
    }

    public String getTpRC() {
        return tpRC;
    }

    public void setTpRC(String tpRC) {
        this.tpRC = tpRC;
    }
}
