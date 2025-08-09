package com.example.mymovies.controller;

import com.example.mymovies.Services.CatFactService;
import com.example.mymovies.model.CatFact;
import okhttp3.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatFactController {
    @Autowired
    private CatFactService catFactService;

    @GetMapping(path = "/cat-fact")
    public CatFact getCatFact(){
        return catFactService.fetchCatFact();
    }

    @GetMapping(path = "/cat-fact/filtered")
    public String getFilteredCatFact(){
        return catFactService.getFilteredCatFact();
    }
}
