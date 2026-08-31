public class MusicPlayer {
    public void printSongs(SongCollection collection) {
        System.out.println("--- " + collection.getName() + " ---");

        SongIterator iterator = collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
    }

    public void printAll(SongCollection... collections) {
        for (SongCollection collection : collections) {
            printSongs(collection);
        }
    }
}
