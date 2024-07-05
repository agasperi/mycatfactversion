package com.globalr.bootcamp.facts;

import com.globalr.bootcamp.api.rest.HechoApi;
import com.globalr.bootcamp.api.rest.model.CatFact;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HechoApiHandler implements HechoApi {

    /**
     * GET /hecho : Get Random Fact
     * Returns a random fact
     *
     * @param maxLength maximum length of returned fact (optional)
     * @return successful operation (status code 200)
     * or Fact not found (status code 404)
     */
    @Override
    public ResponseEntity<CatFact> getRandomFact(Long maxLength) {
        return HechoApi.super.getRandomFact(maxLength);
    }

}
