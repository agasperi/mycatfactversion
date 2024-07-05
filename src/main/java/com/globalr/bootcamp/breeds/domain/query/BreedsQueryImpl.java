package com.globalr.bootcamp.breeds.domain.query;

import com.globalr.bootcamp.breeds.domain.model.Breeds;
import com.globalr.bootcamp.breeds.domain.ports.BreedsClient;
import com.globalr.bootcamp.breeds.domain.ports.BreedsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BreedsQueryImpl implements BreedsQuery {

    private final BreedsClient apiClient;
    private final BreedsRepository repository;

    @Override
    public Breeds getBreeds(Long limit) {
        Breeds result = apiClient.getBreeds(limit);
        repository.save(result);
        return result;
    }

}
