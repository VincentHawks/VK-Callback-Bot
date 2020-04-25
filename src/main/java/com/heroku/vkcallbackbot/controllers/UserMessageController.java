package com.heroku.vkcallbackbot.controllers;


import com.heroku.vkcallbackbot.models.MessageModel;
import com.heroku.vkcallbackbot.models.RequestModel;
import com.heroku.vkcallbackbot.services.MessageService;
import com.heroku.vkcallbackbot.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserMessageController {

    private final String confirmationString = "bbda2286";
    private final long moderator_id = 173806249;
    private final UserService service;
    private final MessageService messageService;

    public UserMessageController(UserService service, MessageService messageService) {
        this.service = service;
        this.messageService = messageService;
    }

    public void processMessage(MessageModel message) {
        if(message.hasAttachments()) {
            messageService.forward(message.getId(), moderator_id);
        } else {
            messageService.send(message.getBody(), message.getUser_id());
        }
    }

    @PostMapping("/")
    public ResponseEntity<String> handleMessage(@RequestBody RequestModel request) {
        if(request.getType().equals("confirmation"))
            return new ResponseEntity<>(confirmationString, HttpStatus.OK);
        else {
            processMessage(request.getObject());
            return new ResponseEntity<>("ok", HttpStatus.OK);
        }
    }

}
