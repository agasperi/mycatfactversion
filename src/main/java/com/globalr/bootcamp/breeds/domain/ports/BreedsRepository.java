package com.globalr.bootcamp.breeds.domain.ports;

import com.globalr.bootcamp.breeds.domain.model.Breeds;

public interface BreedsRepository {

    public void save(Breeds breeds);

}
