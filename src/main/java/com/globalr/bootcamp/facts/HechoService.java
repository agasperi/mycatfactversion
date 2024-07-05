package com.globalr.bootcamp.facts;

import com.globalr.bootcamp.client.rest.model.CatFact;

public interface HechoService {

    public CatFact getRandomFact(Long maxLength);

}
