package com.example.wosmartprojc.repositories;


@Repository
public interface CatRepo extends CrudRepository<Cat, Long> {
    List<Cat> findAll();
}
