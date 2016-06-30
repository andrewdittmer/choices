package com.andrewdittmer.choices.service;

import com.andrewdittmer.choices.model.Choice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrewdittmer on 30/06/16.
 * This is a pretend service.
 */
public class ChoicesService {
    public static List<Choice> getMyChoices() {
        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("Todo", "Create a Todo list", "Creating a todo list is awesome",
                "https://static.sharecare.com/promo/topics/exercise-weight-loss.jpg"));
        return choices;
    }
}
