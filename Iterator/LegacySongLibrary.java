public class LegacySongLibrary implements SongCollection {
    private final Song[] songs;
    private int songCount;

    public LegacySongLibrary(int capacity) {
        songs = new Song[capacity];
    }

    public void addSong(Song song) {
        if (songCount == songs.length) {
            throw new IllegalStateException("The song array is full");
        }
        songs[songCount++] = song;
    }

    @Override
    public String getName() {
        return "Legacy song library (Song[])";
    }

    @Override
    public SongIterator createIterator() {
        return new ArraySongIterator(songs, songCount);
    }
}
