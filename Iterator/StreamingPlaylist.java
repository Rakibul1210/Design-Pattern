import java.util.ArrayList;
import java.util.List;

public class StreamingPlaylist implements SongCollection {
    private final List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    @Override
    public String getName() {
        return "Streaming playlist (ArrayList)";
    }

    @Override
    public SongIterator createIterator() {
        return new ListSongIterator(songs);
    }
}
