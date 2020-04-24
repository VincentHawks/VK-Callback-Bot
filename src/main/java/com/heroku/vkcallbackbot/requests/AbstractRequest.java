package com.heroku.vkcallbackbot.requests;

import lombok.Data;

@Data
public abstract class AbstractRequest {

    private String type;

}
