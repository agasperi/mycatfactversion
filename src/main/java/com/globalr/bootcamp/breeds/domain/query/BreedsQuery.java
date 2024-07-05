package com.globalr.bootcamp.breeds.domain.query;


import com.globalr.bootcamp.breeds.domain.model.Breeds;

public interface BreedsQuery {

    public Breeds getBreeds(Long limit);

}
