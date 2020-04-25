package com.heroku.vkcallbackbot.services;

import com.heroku.vkcallbackbot.models.KeyboardModel;
import com.heroku.vkcallbackbot.models.MessageModel;
import org.jetbrains.annotations.NotNull;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Service
public class MessageService {

    private final RestTemplate restTemplate;
    private final String accessToken =
            "ab710228a50b12fd60bec9cf16e0efaea10b98399cf63dcca3138feedae783234a78b76fdddaacf9d1a3c";

    public MessageService(@NotNull RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public void forward(long message_id, long user_id) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://api.vk.com/method/messages.send?")
        .append("user_id=").append(user_id)
        .append("&random_id=").append(random.nextLong())
        .append("&message=")
        .append("&forward_messages=").append(message_id)
        .append("&access_token=").append(accessToken)
        .append("&v=5.73/");

        String url = stringBuilder.toString();
        this.restTemplate.getForObject(url, String.class);
    }

    public void send(String message, long user_id) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://api.vk.com/method/messages.send?")
                .append("user_id=").append(user_id)
                .append("&random_id=").append(random.nextLong())
                .append("&message=").append(message)
                .append("&access_token=").append(accessToken)
                .append("&v=5.73/");

        String url = stringBuilder.toString();
        this.restTemplate.getForObject(url, String.class);
    }

    public void send(String message, long user_id, KeyboardModel keyboard) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://api.vk.com/method/messages.send?")
                .append("user_id=").append(user_id)
                .append("&random_id=").append(random.nextLong())
                .append("&message=").append(message)
                .append("&keyboard=").append(keyboard.toJSONString())
                .append("&access_token=").append(accessToken)
                .append("&v=5.73/");

        String url = stringBuilder.toString();
        this.restTemplate.getForObject(url, String.class);
    }

}
