package org.example.SwaggerDocExample.model;

import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;

@lombok.Data
@NoArgsConstructor
public class Data {
    String title;
    String url;
    String author;
    Integer num_comments;
    Integer story_id;
    String story_url;
    String parent_id;
    BigInteger created_at;
}
