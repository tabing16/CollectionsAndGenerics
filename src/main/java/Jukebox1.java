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

    public static List<SongV2> getSongV2(){
        List<SongV2> songs = new ArrayList<>();
        songs.add(new SongV2("somersault","zero", 147));
        songs.add(new SongV2("cassidy", "grateful dead", 158));
        songs.add(new SongV2("$10", "hitchiker", 140));
        songs.add(new SongV2("havana","cabello", 105));
        songs.add(new SongV2("Cassidy", "grateful dead", 158));
        songs.add(new SongV2("50 Ways", "simon", 102));
        return songs;
    }
}

class SongV2{
    private String title;
    private String artist;
    private int bpm;

    SongV2(String title, String artist, int bpm){
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }
}
