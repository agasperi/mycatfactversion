package com.globalr.bootcamp.breeds.infra;

import com.globalr.bootcamp.api.rest.BreedsApi;
import com.globalr.bootcamp.api.rest.model.Breeds;
import com.globalr.bootcamp.breeds.BreedsMapper;
import com.globalr.bootcamp.breeds.domain.query.BreedsQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BreedsApiHandler implements BreedsApi {

    public final BreedsQuery service;

    private static final BreedsMapper MAPPER = BreedsMapper.INSTANCE;

    /**
     * GET /breeds : Get a list of breeds
     * Returns a list of breeds
     *
     * @param limit limit the amount of results returned (optional)
     * @return successful operation (status code 200)
     */
    @Override
    public ResponseEntity<Breeds> getBreeds(Long limit) {
        return ResponseEntity.ok(MAPPER.fromBreedsClientToBreedsServer(service.getBreeds(limit)));
    }

}
