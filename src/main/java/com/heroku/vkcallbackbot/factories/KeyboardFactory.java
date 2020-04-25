package com.heroku.vkcallbackbot.factories;

import com.heroku.vkcallbackbot.models.Action;
import com.heroku.vkcallbackbot.models.Button;
import com.heroku.vkcallbackbot.models.KeyboardModel;

import java.util.ArrayList;

public abstract class KeyboardFactory {

    public static KeyboardModel makeKeyboard(String[][] buttons) {
        ArrayList<ArrayList<Button>> container = new ArrayList<>();
        for(int i = 0; i < buttons.length; i++) {
            container.add(new ArrayList<Button>());
            for(int j = 0; j < buttons[i].length; j++) {
                container.get(i).add(new Button());
                container.get(i).get(j).setAction(new Action("", "text", buttons[i][j]));
            }
        }
        return new KeyboardModel(container, true);
    }

}
