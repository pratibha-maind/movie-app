package com.example.mymovies.model;

import jakarta.persistence.Id;
import jakarta.persistence.Index;

public class CatFact {
    private String fact;

    private Integer length;

    public String getFact(){
        return this.fact;
    }

    public void setFact(String fact){
        this.fact = fact;
    }

    public Integer getLength(){
        return this.length;
    }

    public void setLength(Integer len){
        this.length = len;
    }
}
