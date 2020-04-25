package com.heroku.vkcallbackbot.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestModel {

    private String type;
    @JsonProperty("object")
    private MessageModel object;

    private long group_id;
    private String event_id;

}
