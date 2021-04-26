package cat.itb.karaokeapp.Fragments;

import android.os.Bundle;

import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cat.itb.karaokeapp.R;

public class LyricsFragment extends Fragment {

    public LyricsFragment() {
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_lyrics, container, false);

        return v;
    }

    private void changeFragment(android.app.Fragment currentFragment) {
        getFragmentManager().beginTransaction().replace(R.id.content, currentFragment).commit();
    }

}