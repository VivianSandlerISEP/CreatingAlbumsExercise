import java.time.LocalDate;
import java.util.ArrayList;

public class Album {

    private Title albumTitle;
    private Performer albumPerformer;
    private ReleaseDate releaseDate;
    private Label albumLabel;
    private ArrayList<Song> songs;

    public Album(Title albumTitle, Performer albumPerformer, ReleaseDate releaseDate, Label albumLabel,  ArrayList<Song> songs) {

        this.albumTitle = albumTitle;
        this.albumPerformer = albumPerformer;
        this.releaseDate = releaseDate;
        this.albumLabel = albumLabel;
        this.songs = new ArrayList<>();

    }

    public Title getAlbumTitle() {
        return albumTitle;
    }
    public Label getAlbumLabel() {
        return albumLabel;
    }
    public ReleaseDate getReleaseDate() {
        return releaseDate;
    }
    public Performer getAlbumPerformer() {
        return albumPerformer;
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

    @Override

    public String toString(){
        return "Album: " + albumTitle.toString() + ", Performer: " + albumPerformer.toString() + ", ReleaseDate: " + releaseDate.getYear() + ", Label: " + albumLabel.toString() + ", Number of songs: " + songs.size();

    }
}
