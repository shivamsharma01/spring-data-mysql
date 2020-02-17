package com.infosys.people.management.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infosys.people.management.app.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{

}
