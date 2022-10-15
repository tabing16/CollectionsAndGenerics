import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Jukebox1{
    public static void main(String[] args) {
        new Jukebox1().go();
    }

    public void go(){
        List<String> songList = MockSongs.getSongString();
        System.out.println(songList);
    }
}

class MockSongs {
    public static List<String> getSongString(){
        List<String> songs = new ArrayList<>();
        songs.add("somersault");
        songs.add("cassidy");
        songs.add("$10");
        songs.add("havana");
        songs.add("Cassidy");
        songs.add("50 Ways");
        return songs;
    }
}
