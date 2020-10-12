package com.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book,String>{

}
