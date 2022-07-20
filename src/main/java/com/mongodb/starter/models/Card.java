package com.mongodb.starter.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.bson.types.ObjectId;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Card {

    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId id;

    public Chiavi chiavi;
    public Info info;
    public Tipo tipo;
    public Convi convi;
    public DatiFin datiFin;
    public Date insDate;
    public Date updDate;
    public int version;
    public String _class;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Chiavi getChiavi() {
        return chiavi;
    }

    public void setChiavi(Chiavi chiavi) {
        this.chiavi = chiavi;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Convi getConvi() {
        return convi;
    }

    public void setConvi(Convi convi) {
        this.convi = convi;
    }

    public DatiFin getDatiFin() {
        return datiFin;
    }

    public void setDatiFin(DatiFin datiFin) {
        this.datiFin = datiFin;
    }

    public Date getInsDate() {
        return insDate;
    }

    public void setInsDate(Date insDate) {
        this.insDate = insDate;
    }

    public Date getUpdDate() {
        return updDate;
    }

    public void setUpdDate(Date updDate) {
        this.updDate = updDate;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }




}
