import java.util.List;
import java.util.NoSuchElementException;

public class ListSongIterator implements SongIterator {
    private final List<Song> songs;
    private int position;

    public ListSongIterator(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public Song next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more songs in the list");
        }
        return songs.get(position++);
    }
}
