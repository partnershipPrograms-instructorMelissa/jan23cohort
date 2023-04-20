package com.example.wosmartprojc.repositories;

@Repository
public interface CartRepo extends CrudRepository<Cart, Long> {
    List<Cart> findAll();
}
