package org.example.SwaggerDocExample.controller;

import org.example.SwaggerDocExample.model.AuthorInformation;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
@EnableCaching
public class AuthDetailsController {
    @GetMapping("/authors/{authorName}")
    @Cacheable(value = "ten-seconds",key = "#authorName")
    public AuthorInformation getAuthorDetails(@PathVariable String authorName){
        RestTemplate restTemplate = new RestTemplate();
        System.out.println("hitting the api");
        AuthorInformation authorInformation = restTemplate.getForObject("https://jsonmock.hackerrank.com/api/articles?author="+authorName,AuthorInformation.class);
        return authorInformation;
    }
}
