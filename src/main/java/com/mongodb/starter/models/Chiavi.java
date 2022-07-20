package com.mongodb.starter.models;

import java.util.ArrayList;

public class Chiavi {
    public String nmCH;
    public String iban;
    public String nmCC;
    public String ndgTit;
    public ArrayList<String> cdF;
    public ArrayList<String> ndg;
    public ArrayList<String> pIva;
    public String cdFTit;
    public String ndgPos;
    public String pIPos;


    public String getNmCH() {
        return nmCH;
    }

    public void setNmCH(String nmCH) {
        this.nmCH = nmCH;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getNmCC() {
        return nmCC;
    }

    public void setNmCC(String nmCC) {
        this.nmCC = nmCC;
    }

    public String getNdgTit() {
        return ndgTit;
    }

    public void setNdgTit(String ndgTit) {
        this.ndgTit = ndgTit;
    }

    public ArrayList<String> getCdF() {
        return cdF;
    }

    public void setCdF(ArrayList<String> cdF) {
        this.cdF = cdF;
    }

    public ArrayList<String> getNdg() {
        return ndg;
    }

    public void setNdg(ArrayList<String> ndg) {
        this.ndg = ndg;
    }

    public ArrayList<String> getpIva() {
        return pIva;
    }

    public void setpIva(ArrayList<String> pIva) {
        this.pIva = pIva;
    }

    public String getCdFTit() {
        return cdFTit;
    }

    public void setCdFTit(String cdFTit) {
        this.cdFTit = cdFTit;
    }

    public String getNdgPos() {
        return ndgPos;
    }

    public void setNdgPos(String ndgPos) {
        this.ndgPos = ndgPos;
    }

    public String getpIPos() {
        return pIPos;
    }

    public void setpIPos(String pIPos) {
        this.pIPos = pIPos;
    }
}
