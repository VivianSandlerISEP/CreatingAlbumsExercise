import java.time.LocalDate;
import java.util.ArrayList;

public class Album {

    private String albumTitle;
    private Performer albumPerformer;
    private ArrayList<Song> songs;
    private ReleaseDate releaseDate;
    private Label albumLabel;

    public Album() {

        this.albumTitle = albumTitle;
        this.albumPerformer = albumPerformer;
        this.releaseDate = releaseDate;
        this.albumLabel = albumLabel;
        this.songs = new ArrayList<>();

    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void addSongs(Song song) {

        this.songs.add(song);
    }

    public void removeSongs(Song song) {

        this.songs.remove(song);
    }

    public ArrayList<Song> getSongs() {

        return songs;
    }

    public int getNumberOfSongs() {

        return songs.size();
    }

    public ReleaseDate getReleaseDate() {

        return releaseDate;
    }

    @Override

    public String toString(){
        return "Album: " + albumTitle + ", Performer:  " + albumPerformer + ", ReleaseDate: " + releaseDate.getYear() + ", Label: " + albumLabel + ", Number of songs: " + songs.size();

    }
}
