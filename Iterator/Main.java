public class Main {
    public static void main(String[] args) {
        StreamingPlaylist streamingPlaylist = new StreamingPlaylist();
        streamingPlaylist.addSong(new Song("S01", "Midnight Drive", "The Signals"));
        streamingPlaylist.addSong(new Song("S02", "Northern Lights", "Paper Skies"));

        LegacySongLibrary legacyLibrary = new LegacySongLibrary(3);
        legacyLibrary.addSong(new Song("L01", "Old Photographs", "The Memories"));
        legacyLibrary.addSong(new Song("L02", "Vinyl Summer", "Golden Days"));

        DownloadedSongLibrary downloadedLibrary = new DownloadedSongLibrary();
        downloadedLibrary.addSong(new Song("D01", "Offline Echo", "Night Transit"));
        downloadedLibrary.addSong(new Song("D02", "Stored Away", "Blue Archive"));

        MusicPlayer player = new MusicPlayer();
        player.printAll(streamingPlaylist, legacyLibrary, downloadedLibrary);
    }
}
