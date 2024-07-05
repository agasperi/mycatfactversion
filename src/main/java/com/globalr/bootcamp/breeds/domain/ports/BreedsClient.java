package com.globalr.bootcamp.breeds.domain.ports;


import com.globalr.bootcamp.breeds.domain.model.Breeds;

public interface BreedsClient {

    public Breeds getBreeds(Long limit);

}
