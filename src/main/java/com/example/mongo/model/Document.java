package com.example.mongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@org.springframework.data.mongodb.core.mapping.Document(collection = "document")
public class Document {

    @Id

    private String id;

    @Field
    private String text;
}
