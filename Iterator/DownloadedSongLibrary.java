import java.util.Hashtable;

public class DownloadedSongLibrary implements SongCollection {
    private final Hashtable<String, Song> songs = new Hashtable<>();

    public void addSong(Song song) {
        songs.put(song.getId(), song);
    }

    @Override
    public String getName() {
        return "Downloaded song library (Hashtable)";
    }

    @Override
    public SongIterator createIterator() {
        return new HashtableSongIterator(songs.elements());
    }
}
