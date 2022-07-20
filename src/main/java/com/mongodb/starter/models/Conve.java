package com.mongodb.starter.models;

import java.util.Date;

public class Conve {
    public String cod;
    public String stato;
    public Date dtAtt;
    public Date dtRev;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public Date getDtAtt() {
        return dtAtt;
    }

    public void setDtAtt(Date dtAtt) {
        this.dtAtt = dtAtt;
    }

    public Date getDtRev() {
        return dtRev;
    }

    public void setDtRev(Date dtRev) {
        this.dtRev = dtRev;
    }
}
