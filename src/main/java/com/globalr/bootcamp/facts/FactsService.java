package com.globalr.bootcamp.facts;

import com.globalr.bootcamp.client.rest.model.CatFacts;

public interface FactsService {

    public CatFacts getFacts(Long maxLength, Long limit);

}
