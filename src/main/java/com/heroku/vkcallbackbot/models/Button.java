
package com.heroku.vkcallbackbot.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuppressWarnings("unused")
public class Button {

    private Action action;
    private String color;

    public String toJSONString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\"action\": ").append(action.toJSONString()).append(", ")
                .append("\"color\": \"").append(color).append("\"}");
        return sb.toString();
    }

}
