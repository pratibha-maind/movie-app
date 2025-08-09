package com.example.mymovies.Services;

import com.example.mymovies.client.DomainOpenApiClient;
import com.example.mymovies.mapper.CatFactsMapper;
import com.example.mymovies.model.CatFact;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatFactService {
    @Autowired
    private DomainOpenApiClient domainOpenApiClient;

    @Autowired
    private CatFactsMapper catFactsMapper;
    public CatFact fetchCatFact(){
        String response = domainOpenApiClient.fetchCatDataFromOpenApi();
        try{
            return catFactsMapper.mapResponce(response);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("failed to map",e);
        }
    }

    public String getFilteredCatFact(){
        String response = domainOpenApiClient.fetchCatDataFromOpenApi();
        CatFact catFactResponse;
        try{
            catFactResponse = catFactsMapper.mapResponce(response);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("failed to map",e);
        }

        if(catFactResponse.getLength() < 40){
            return "Too Short";
        }else return catFactResponse.getFact();
    }
}
