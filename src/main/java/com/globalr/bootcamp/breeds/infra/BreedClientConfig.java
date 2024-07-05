package com.globalr.bootcamp.breeds.infra;

import com.globalr.bootcamp.client.rest.ApiClient;
import com.globalr.bootcamp.client.rest.api.BreedsApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BreedClientConfig {

    @Value("${application.http.client.host}")
    private String baseUri;

    @Bean
    ApiClient apiClient() {
        ApiClient client = new ApiClient();
        client.updateBaseUri(baseUri);
        return client;
    }

    @Bean
    BreedsApi breedsApi(ApiClient apiClient) {
        return new BreedsApi(apiClient);
    }

}
