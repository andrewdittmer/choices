package com.andrewdittmer.choices;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Shows a title, description and an image to explain to the user why
 * the list is empty and what to do next.
 * Use the {@link EmptyChoicesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EmptyChoicesFragment extends Fragment {
    private static final String ARG_TITLE = "title";
    private static final String ARG_DESCRIPTION = "description";
    private static final String ARG_ICON = "icon";

    private String mTitle;
    private String mDescription;
    private int mIcon;


    public EmptyChoicesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param title The title.
     * @param description The description.
     * @return A new instance of fragment EmptyChoicesFragment.
     */
    public static EmptyChoicesFragment newInstance(String title, String description, int icon) {
        EmptyChoicesFragment fragment = new EmptyChoicesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TITLE, title);
        args.putString(ARG_DESCRIPTION, description);
        args.putInt(ARG_ICON, icon);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mTitle = getArguments().getString(ARG_TITLE);
            mDescription = getArguments().getString(ARG_DESCRIPTION);
            mIcon = getArguments().getInt(ARG_ICON);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_empty_choices, container, false);

        TextView txtTitle = (TextView) root.findViewById(R.id.txt_title);
        TextView txtDescription = (TextView) root.findViewById(R.id.txt_description);
        ImageView imgIcon = (ImageView) root.findViewById(R.id.img_icon);

        txtTitle.setText(mTitle);
        txtDescription.setText(mDescription);
        imgIcon.setImageResource(mIcon);

        return root;
    }

}
