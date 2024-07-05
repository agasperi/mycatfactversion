package com.globalr.bootcamp.facts;

import com.globalr.bootcamp.api.rest.FactsApi;
import com.globalr.bootcamp.api.rest.model.CatFacts;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactsApiHandler implements FactsApi {
    /**
     * GET /facts : Get a list of facts
     * Returns a list of facts
     *
     * @param maxLength maximum length of returned fact (optional)
     * @param limit     limit the amount of results returned (optional)
     * @return successful operation (status code 200)
     */
    @Override
    public ResponseEntity<CatFacts> getFacts(Long maxLength, Long limit) {
        return FactsApi.super.getFacts(maxLength, limit);
    }
}
