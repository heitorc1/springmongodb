package com.heitorc1.springmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.heitorc1.springmongodb.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
