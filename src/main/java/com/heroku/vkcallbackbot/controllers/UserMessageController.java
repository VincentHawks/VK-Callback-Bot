package com.heroku.vkcallbackbot.controllers;


import com.heroku.vkcallbackbot.requests.AbstractRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserMessageController {

    private boolean confirmed = false;

    @PostMapping("/")
    public ResponseEntity<String> resolveCall(@RequestBody String request) {
        System.out.println(request);
        return new ResponseEntity<>("Ok", HttpStatus.OK);
    }

}
