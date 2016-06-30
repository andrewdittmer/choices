package com.andrewdittmer.choices.ui.choices;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.andrewdittmer.choices.R;
import com.andrewdittmer.choices.model.Choice;

/**
 * Created by andrewdittmer on 30/06/16.
 */
public class ChoiceLayout extends LinearLayout {

    private Choice mChoice;

    public ChoiceLayout(Context context, Choice choice) {
        super(context);
        mChoice = choice;
        init();
    }

    public void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_choice, this, true);
        TextView txtTitle = (TextView) findViewById(R.id.txt_title);
        TextView txtName = (TextView) findViewById(R.id.txt_name);
        TextView txtDescription = (TextView) findViewById(R.id.txt_description);

        txtTitle.setText(mChoice.getTitle());
        txtName.setText(mChoice.getName());
        txtDescription.setText(mChoice.getDescription());
    }
}
