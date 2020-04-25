
package com.heroku.vkcallbackbot.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuppressWarnings("unused")
public class Action {

    private String payload;
    private String type;
    private String label;

    public String toJSONString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\"payload\": \"").append(payload).append("\", ")
                .append("\"type\": \"").append(type).append("\", ")
                .append("\"label\": \"").append(label).append("\"}");
        return sb.toString();
    }

}
