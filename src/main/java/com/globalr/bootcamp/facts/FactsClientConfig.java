package com.globalr.bootcamp.facts;

import com.globalr.bootcamp.client.rest.ApiClient;
import com.globalr.bootcamp.client.rest.api.FactsApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactsClientConfig {

    @Value("${application.http.client.host}")
    private String baseUri;

    @Bean
    ApiClient apiClient() {
        ApiClient client = new ApiClient();
        client.updateBaseUri(baseUri);
        return client;
    }

    @Bean
    FactsApi factsApi(ApiClient apiClient) {
        return new FactsApi(apiClient);
    }

}
