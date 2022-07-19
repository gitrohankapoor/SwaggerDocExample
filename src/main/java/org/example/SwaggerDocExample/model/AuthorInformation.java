package org.example.SwaggerDocExample.model;

import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@lombok.Data
@NoArgsConstructor
public class AuthorInformation {
    Integer page;
    Integer per_page;
    Integer total;
    Integer total_pages;
    List<Data> data;

}
