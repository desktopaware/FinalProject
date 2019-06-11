package android.example.mylibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class JokeFragment extends Fragment {

    String joke;

    public JokeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_joke, container, false);
        Intent intent = getActivity().getIntent();
        joke = intent.getStringExtra(JokeActivity.JOKE_KEY);
        //Toast.makeText(getActivity(), joke, Toast.LENGTH_SHORT).show();
        TextView jokeTextView = root.findViewById(R.id.joke_text_view);

        if (!TextUtils.isEmpty(joke)) {
            jokeTextView.setText(joke);
        }

        return root;

    }
}
