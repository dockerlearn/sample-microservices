package com.myapp.cloud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.myapp.cloud.domain.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, Integer> {

}
