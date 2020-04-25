
package com.heroku.vkcallbackbot.models;

import lombok.Data;

import java.util.ArrayList;

@Data
@SuppressWarnings("unused")
public class KeyboardModel {

    private ArrayList<ArrayList<Button>> buttons;
    private Boolean oneTime;

    public KeyboardModel(ArrayList<ArrayList<Button>> buttons, Boolean oneTime) {
        this.buttons = buttons;
        this.oneTime = oneTime;
    }

    public KeyboardModel() {
    }

    public String toJSONString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\"buttons\": [");
        for(ArrayList<Button> row : buttons) {
            sb.append("[");
            boolean first = true;
            for(Button button : row) {
                if(!first) sb.append(", ");
                sb.append(button.toJSONString());
            }
            sb.append("], ");
        }
        sb.append("], \"onetime\": ").append(oneTime).append("}");
        return sb.toString();
    }

}
