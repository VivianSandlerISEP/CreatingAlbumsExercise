import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlbumTest {

    @Test
    void construtorInicialized() {

        /*Title title = new Title("The Fate of Ophelia");
        ReleaseDate date = new ReleaseDate(LocalDate.of(2025, 10, 3));
        ArrayList<Performer> performers = new ArrayList<>();
        performers.add(new Performer(new Person("Taylor Swift", "Taylor Swift")));
        Writer writer = new Writer(new Person("Taylor Swift", "Taylor Swift"));
        Label label = new Label("Republic");

        Song song = new Song(title, date, performers, label, writer);*/

        Title albumTitle = new Title("The Life of a Showgirl");
        Performer albumPerformer = new Performer(new Person("Taylor Swift", "Taylor Swift"));
        ArrayList<Song> songs = new ArrayList<>();
        ReleaseDate date2 = new ReleaseDate(LocalDate.of(2030, 11, 1));
        Label albumLabel = new Label("Republic");
        /*songs.add(new Song(title, date, performers, label, writer));*/

        Album album = new Album(albumTitle, albumPerformer, date2, albumLabel, songs);

        assertEquals("The Life of a Showgirl", album.getAlbumTitle().getTitle());
        assertEquals("Taylor Swift", album.getAlbumPerformer().getPerformer().getName());
        assertEquals(date2, album.getReleaseDate());
        assertEquals("Republic", album.getAlbumLabel().getlabelName());

        //assertEquals for Song
        /*String expected = "Elizabeth Taylor - Taylor Swift (Taylor Swift); Writer: Max Martin (2025)";*/
        /*assertEquals(songs, album.getSongs());*/

        //assertEquals for Album
        String expected = "Album: The Life of a Showgirl, Performer: Taylor Swift (Taylor Swift), ReleaseDate: 2030, Label: Republic, Number of songs: 0";
        assertEquals(expected, album.toString());
    }
    @Test
    public void testAddSong() {

        Title title = new Title("The Fate of Ophelia");
        ReleaseDate date = new ReleaseDate(LocalDate.of(2025, 10, 3));
        ArrayList<Performer> performers = new ArrayList<>();
        performers.add(new Performer(new Person("Taylor Swift", "Taylor Swift")));
        Writer writer = new Writer(new Person("Taylor Swift", "Taylor Swift"));
        Label label = new Label("Republic");

        Song song = new Song(title, date, performers, label, writer);



        Song song = new Song(title, date, performers, label, writer);
        Performer performer1 = new Performer(new Person("Performer1", "Performer1StageName"));

        song.addPerformer(performer1);

        List<Performer> list = song.getPerformers();
        assertEquals(1, list.size());
        assertEquals(performer1, list.get(0));

        ArrayList<Song> songs = new ArrayList<>();
    }

    @Test
    public void testAddMultiplePerformers() {
        Title title = new Title("Test song");
        ReleaseDate date = new ReleaseDate(LocalDate.of(2025, 1, 1));
        Label label = new Label("Test label");
        Writer writer = new Writer(new Person("Writer", "Writer"));
        ArrayList<Performer> performers = new ArrayList<>();

        Song song = new Song(title, date, performers, label, writer);


        Performer performer1 = new Performer(new Person("Performer1", "Performer1StageName"));
        Performer performer2 = new Performer(new Person("Performer2", "Performer2StageName"));

        song.addPerformer(performer1);
        song.addPerformer(performer2);

        List<Performer> expected = List.of(performer1, performer2);
        assertArrayEquals(expected.toArray(), song.getPerformers().toArray());

    }

    // Test to method toString
    @Test
    void testToStringReturnsExpectedFormat() {
        LocalDate date2 = LocalDate.of(2025, 10, 3);
        ReleaseDate releaseDate2 = new ReleaseDate(date2);
        Title title2 = new Title("Elizabeth Taylor");
        Label label2 = new Label("Republic");
        Writer writer2 = new Writer(new Person("Max Martin","Max Martin"));

        ArrayList<Performer> performers2 = new ArrayList<>();
        performers2.add(new Performer(new Person("Taylor Swift", "Taylor Swift")));

        Song song2 = new Song(title2, releaseDate2, performers2, label2, writer2);

        String expected2 = "Elizabeth Taylor - Taylor Swift (Taylor Swift); Writer: Max Martin (2025)";
        assertEquals(expected2, song2.toString());

    }
}*/





 /*  public void testAddSong(){
       Album album = new Album("Test Album");
       Song song1 = new Song("Song A", 100);

       album.addSong(song1);

       List<Song> songs = album.getSongs();
       assertEquals(1, songs.size());
       assertEquals(song1, songs.get(0));

   }

   public void testAddMultipleSongs(){
       Album album = new Album("Test Album");
       Song song1 = new Song("Song A", 100);
       Song song2 = new Song("Song B", 200);

       album.addSong(song1);
       album.addSong(song2);

       List<Song> expected = List.of(song1, song2)
       assertArrayEquals(expected.toArray(), album.getSongs().toArray());

   }

}
*/
