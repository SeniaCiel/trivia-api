package com.dummy.trivia.db.repository;

import com.dummy.trivia.db.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    public User findByUsername(String username);
}
