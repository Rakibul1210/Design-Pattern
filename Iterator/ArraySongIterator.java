import java.util.NoSuchElementException;

public class ArraySongIterator implements SongIterator {
    private final Song[] songs;
    private final int size;
    private int position;

    public ArraySongIterator(Song[] songs, int size) {
        this.songs = songs;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return position < size;
    }

    @Override
    public Song next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more songs in the array");
        }
        return songs[position++];
    }
}
