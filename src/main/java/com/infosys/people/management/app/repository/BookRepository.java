package com.infosys.people.management.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.infosys.people.management.app.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
