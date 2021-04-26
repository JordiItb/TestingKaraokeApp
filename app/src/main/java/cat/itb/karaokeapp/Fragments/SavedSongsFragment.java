package cat.itb.karaokeapp.Fragments;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import cat.itb.karaokeapp.Adapter.SongAdapter;
import cat.itb.karaokeapp.Model.Song;
import cat.itb.karaokeapp.R;

public class SavedSongsFragment extends Fragment {

    private List<Song> savedSongs;

    private RecyclerView recyclerSaved;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    public SavedSongsFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }

        savedSongs = this.getAllSavedSongs();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_saved_songs, container, false);

        recyclerSaved = v.findViewById(R.id.recyclerSaved);
        layoutManager = new LinearLayoutManager(getActivity());
        adapter = new SongAdapter(savedSongs, R.layout.item_view, new SongAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Song song, int position) {
                changeFragment(new LyricsFragment());
            }
        });

        recyclerSaved.setLayoutManager(layoutManager);
        recyclerSaved.setAdapter(adapter);

        return v;
    }

    private List<Song> getAllSavedSongs(){

        return new ArrayList<Song>(){{
            add(new Song("Test2", "Test2", R.drawable.ic_launcher_foreground, 3, "test2"));
            add(new Song("Test2", "Test2", R.drawable.ic_launcher_foreground, 3, "test2"));
            add(new Song("Test2", "Test2", R.drawable.ic_launcher_foreground, 3, "test2"));
            add(new Song("Test2", "Test2", R.drawable.ic_launcher_foreground, 3, "test2"));
            add(new Song("Test2", "Test2", R.drawable.ic_launcher_foreground, 3, "test2"));
            add(new Song("Test2", "Test2", R.drawable.ic_launcher_foreground, 3, "test2"));
            add(new Song("Test2", "Test2", R.drawable.ic_launcher_foreground, 3, "test2"));
            add(new Song("Test2", "Test2", R.drawable.ic_launcher_foreground, 3, "test2"));
            add(new Song("Test2", "Test2", R.drawable.ic_launcher_foreground, 3, "test2"));
            add(new Song("Test2", "Test2", R.drawable.ic_launcher_foreground, 3, "test2"));
            add(new Song("Test2", "Test2", R.drawable.ic_launcher_foreground, 3, "test2"));
            add(new Song("Test2", "Test2", R.drawable.ic_launcher_foreground, 3, "test2"));
            add(new Song("Test2", "Test2", R.drawable.ic_launcher_foreground, 3, "test2"));
            add(new Song("Test2", "Test2", R.drawable.ic_launcher_foreground, 3, "test2"));

        }};

    }

    private void changeFragment(android.app.Fragment currentFragment) {
        getFragmentManager().beginTransaction().replace(R.id.content, currentFragment).commit();
    }
}