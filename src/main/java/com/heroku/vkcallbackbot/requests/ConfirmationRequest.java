package com.heroku.vkcallbackbot.requests;

import lombok.Data;

@Data
public class ConfirmationRequest extends AbstractRequest {

    private long group_id;

    public ConfirmationRequest(String type, long group_id) {
        super.setType(type);
        this.group_id = group_id;
    }

}
