package com.globalr.bootcamp.facts;

import com.globalr.bootcamp.client.rest.model.CatFacts;
import com.globalr.bootcamp.facts.FactsService;
import org.springframework.stereotype.Service;

/** FactsServiceImpl.                 */
/*  Un comentario para probar el pull */
@Service
public class FactsServiceImpl implements FactsService {
    @Override
    public CatFacts getFacts(Long maxLength, Long limit) {
        return null;
    }
}
