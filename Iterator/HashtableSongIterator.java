import java.util.Enumeration;
import java.util.NoSuchElementException;

public class HashtableSongIterator implements SongIterator {
    private final Enumeration<Song> songs;

    public HashtableSongIterator(Enumeration<Song> songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return songs.hasMoreElements();
    }

    @Override
    public Song next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more songs in the hashtable");
        }
        return songs.nextElement();
    }
}
