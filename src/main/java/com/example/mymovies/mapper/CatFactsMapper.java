package com.example.mymovies.mapper;

import com.example.mymovies.model.CatFact;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.ResponseBody;
import org.springframework.stereotype.Component;

@Component
public class CatFactsMapper {
    private ObjectMapper objectMapper = new ObjectMapper();

    public CatFact mapResponce(String response) throws JsonProcessingException {
        CatFact catFact = objectMapper.readValue(response, CatFact.class);
        return catFact;
    }
}
