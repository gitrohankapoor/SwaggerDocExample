package org.example.SwaggerDocExample.service;

import org.example.SwaggerDocExample.model.AuthorInformation;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthDetailsService {
    public AuthorInformation getAuthDetails(String author){
        RestTemplate restTemplate = new RestTemplate();
        AuthorInformation authorInformation = restTemplate.getForObject("https://jsonmock.hackerrank.com/api/articles?author=patricktomas",AuthorInformation.class);
        return authorInformation;
    }
}
