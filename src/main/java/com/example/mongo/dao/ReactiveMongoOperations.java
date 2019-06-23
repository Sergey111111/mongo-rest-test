package com.example.mongo.dao;

import org.springframework.data.mongodb.core.query.Query;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ReactiveMongoOperations {
    <T> Flux<T> findAll(Query query, Class<T> entityClass);
    <T> Mono<T> save(T objectToSave, String collectionName);
}
