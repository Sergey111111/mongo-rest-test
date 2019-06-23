package com.example.mongo.dao;

import com.example.mongo.model.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DocumentRepository extends MongoRepository<Document, Long> {

    Document findById(String id);

    @Override
    List<Document> findAll();
}
