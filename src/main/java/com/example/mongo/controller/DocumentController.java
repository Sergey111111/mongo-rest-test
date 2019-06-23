package com.example.mongo.controller;

import com.example.mongo.dao.DocumentRepository;
import com.example.mongo.model.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DocumentController {


    private final DocumentRepository repository;

    public DocumentController(DocumentRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Document> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody Document doc) {
        repository.save(doc);
    }

    @GetMapping("/{id}")
    public Document findOne(@PathVariable("id") String id) {
        return repository.findById(id);
    }
}
