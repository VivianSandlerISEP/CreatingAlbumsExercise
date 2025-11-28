import java.time.LocalDate;
import java.util.ArrayList;

public class Song {

    //Attributes
    private Title songTitle;
    private ReleaseDate releaseDate;
    private ArrayList<Performer> performers;
    private Label labelName;
    private Writer writer;

    //Constructor
    public Song () {
        this.songTitle = songTitle;
        this.releaseDate = releaseDate;
        this.performers = performers;
        this.labelName = labelName;
        this.writer = writer;
    }

    //Getters

    public Title getSongTitle() {
        return songTitle;
    }

    public ReleaseDate getReleaseDate() {
        return releaseDate;
    }

//    public Performer[] getPerformers() {
//        return performers;
//    }

    public Label getLabelName() {
        return labelName;
    }
    public Writer getWriter() {
        return writer;
    }

    //Method to get the album that the song belongs to
    public Album getAlbum() {
        return album;
    }
    //Method to verify if the song belong to an album
    public boolean songBelongsToAnAlbum() {
        if (album != null){
            return true;
        }
        return false;
    }

    // Method to add performers
    public void addPerformer(Performer performer) {
        this.performers.add(performer);
    }

    // Method to get the performs list
    public ArrayList<Performer> getPerformers() {
        return new ArrayList<>(this.performers);
    }

    // Method to count the number of performers
    public int countPerformers() {
        return this.performers.size();
    }

    //toString
    @Override
    public String toString() {
        return songTitle + " - " + performers.toString() + " (" + releaseDate.getYear() + ")";
    }
}
