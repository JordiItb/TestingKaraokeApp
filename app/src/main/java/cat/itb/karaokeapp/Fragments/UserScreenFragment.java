package cat.itb.karaokeapp.Fragments;

import android.os.Bundle;

import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import cat.itb.karaokeapp.Adapter.SongAdapter;
import cat.itb.karaokeapp.Model.Song;
import cat.itb.karaokeapp.R;


public class UserScreenFragment extends Fragment {

    private List<Song> popSongs;
    private List<Song> recSongs;
    private RecyclerView recyclerPopular;
    private RecyclerView recyclerRec;
    private RecyclerView.Adapter adapter;
    private RecyclerView.Adapter adapterRec;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.LayoutManager layoutManagerRec;

    public UserScreenFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        popSongs = this.getAllPopSongs();
        recSongs = this.getAllRecSongs();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_user_screen, container, false);

        recyclerPopular = v.findViewById(R.id.recylcerViewPop);
        recyclerRec = v.findViewById(R.id.recylcerViewRec);
        layoutManager = new LinearLayoutManager(getActivity());
        layoutManagerRec = new LinearLayoutManager(getActivity());
        adapter = new SongAdapter(popSongs, R.layout.item_view, new SongAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Song song, int position) {
                changeFragment(new LyricsFragment());
            }
        });
        adapterRec = new SongAdapter(recSongs, R.layout.item_view, new SongAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Song song, int position) {
                changeFragment(new LyricsFragment());
            }
        });

        recyclerPopular.setLayoutManager(layoutManager);
        recyclerPopular.setAdapter(adapter);
        recyclerRec.setLayoutManager(layoutManagerRec);
        recyclerRec.setAdapter(adapterRec);

        return v;

    }

    private void changeFragment(Fragment currentFragment) {
        getFragmentManager().beginTransaction().replace(R.id.content, currentFragment).commit();
    }

    private List<Song> getAllPopSongs(){

        return new ArrayList<Song>(){{
           add(new Song("Test", "Test", R.drawable.songimg, 3, "test"));
            add(new Song("Test", "Test", R.drawable.songimg, 3, "test"));
            add(new Song("Test", "Test", R.drawable.songimg, 3, "test"));
            add(new Song("Test", "Test", R.drawable.songimg, 3, "test"));
            add(new Song("Test", "Test", R.drawable.songimg, 3, "test"));
            add(new Song("Test", "Test", R.drawable.songimg, 3, "test"));
            add(new Song("Test", "Test", R.drawable.songimg, 3, "test"));
        }};

    }

    private List<Song> getAllRecSongs(){

        return new ArrayList<Song>(){{
            add(new Song("Test2", "Test2", R.drawable.logo, 3, "test2"));
            add(new Song("Test2", "Test2", R.drawable.logo, 3, "test2"));
            add(new Song("Test2", "Test2", R.drawable.logo, 3, "test2"));
            add(new Song("Test2", "Test2", R.drawable.logo, 3, "test2"));
            add(new Song("Test2", "Test2", R.drawable.logo, 3, "test2"));

        }};

    }

}