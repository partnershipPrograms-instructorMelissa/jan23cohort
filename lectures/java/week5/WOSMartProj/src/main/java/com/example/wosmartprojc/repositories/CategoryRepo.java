package com.example.wosmartprojc.repositories;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Long> {
    List<Category> findAll();

}
