package com.mongodb.starter.models;

import java.util.Date;

public class Info {
    public String nmMask;
    public Date dtScad;
    public String intest;
    public String intestPos;
    public String fil;
    public String stato;

    public String getNmMask() {
        return nmMask;
    }

    public void setNmMask(String nmMask) {
        this.nmMask = nmMask;
    }

    public Date getDtScad() {
        return dtScad;
    }

    public void setDtScad(Date dtScad) {
        this.dtScad = dtScad;
    }

    public String getIntest() {
        return intest;
    }

    public void setIntest(String intest) {
        this.intest = intest;
    }

    public String getIntestPos() {
        return intestPos;
    }

    public void setIntestPos(String intestPos) {
        this.intestPos = intestPos;
    }

    public String getFil() {
        return fil;
    }

    public void setFil(String fil) {
        this.fil = fil;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }
}
