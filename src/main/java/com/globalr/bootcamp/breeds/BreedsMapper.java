package com.globalr.bootcamp.breeds;

import com.globalr.bootcamp.api.rest.model.Breeds;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BreedsMapper {

    BreedsMapper INSTANCE = Mappers.getMapper(BreedsMapper.class);

    Breeds fromBreedsClientToBreedsServer(com.globalr.bootcamp.client.rest.model.Breeds breeds);

}
