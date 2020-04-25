package com.heroku.vkcallbackbot.services;

import com.heroku.vkcallbackbot.models.UserModel;
import com.heroku.vkcallbackbot.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<UserModel> getAll() {
        return repository.findAll();
    }

}
