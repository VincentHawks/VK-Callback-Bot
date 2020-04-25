package com.heroku.vkcallbackbot.repositories;

import com.heroku.vkcallbackbot.models.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserModel, Long> {
}
