
package com.heroku.vkcallbackbot.models;

import lombok.Data;

@Data
@SuppressWarnings("unused")
public class Button {

    private Action action;
    private String color;

    public Button(Action action, String color) {
        this.action = action;
        this.color = color;
    }

    public Button() {
    }

    public String toJSONString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\"action\":").append(action.toJSONString()).append(",")
                .append("\"color\":\"").append(color).append("\"}");
        return sb.toString();
    }

}
