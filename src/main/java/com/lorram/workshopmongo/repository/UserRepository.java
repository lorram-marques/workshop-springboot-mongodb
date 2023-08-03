package com.lorram.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lorram.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
