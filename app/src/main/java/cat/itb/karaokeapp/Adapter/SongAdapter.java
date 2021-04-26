package cat.itb.karaokeapp.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cat.itb.karaokeapp.Model.Song;
import cat.itb.karaokeapp.R;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {

    private List<Song> songs;
    private int layout;
    private OnItemClickListener itemClickListener;

    public interface OnItemClickListener{
        void onItemClick(Song song, int position);
    }

    public SongAdapter(List<Song> songs, int layout, OnItemClickListener itemClickListener) {
        this.songs = songs;
        this.layout = layout;
        this.itemClickListener = itemClickListener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView artistName;
        public TextView songName;
        public ImageView songImg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.artistName = itemView.findViewById(R.id.artistText);
            this.songName = itemView.findViewById(R.id.songTitle);
            this.songImg = itemView.findViewById(R.id.image);


        }

        public void bind(final Song song, final OnItemClickListener listener){

            this.artistName.setText(song.getArtist());
            this.songImg.setImageResource(song.getImg());
            this.songName.setText(song.getTitle());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(song, getAdapterPosition());
                }
            });

        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(this.layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(this.songs.get(position), this.itemClickListener);
    }

    @Override
    public int getItemCount() {
        return this.songs.size();
    }

}
