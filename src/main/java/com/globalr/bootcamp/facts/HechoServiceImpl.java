package com.globalr.bootcamp.facts;

import com.globalr.bootcamp.client.rest.model.CatFact;
import com.globalr.bootcamp.facts.HechoService;
import org.springframework.stereotype.Service;

@Service
public class HechoServiceImpl implements HechoService {
    @Override
    public CatFact getRandomFact(Long maxLength) {
        return null;
    }
}
