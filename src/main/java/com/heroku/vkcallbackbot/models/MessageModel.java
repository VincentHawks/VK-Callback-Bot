package com.heroku.vkcallbackbot.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageModel {

    @Id
    private long id;
    private long date; // POSIX timestamp
    private long user_id;
    private String body;

    List<AttachmentModel> attachments = null;

    // Everything else we aren't really concerned about


    public boolean hasAttachments() {
        return attachments != null;
    }
}
