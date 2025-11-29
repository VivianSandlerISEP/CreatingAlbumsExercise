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

        //Song
        Title title = new Title("The Fate of Ophelia");
        ReleaseDate date = new ReleaseDate(LocalDate.of(2025, 10, 3));
        ArrayList<Performer> performers = new ArrayList<>();
        performers.add(new Performer(new Person("Taylor Swift", "Taylor Swift")));
        Writer writer = new Writer(new Person("Taylor Swift", "Taylor Swift"));
        Label label = new Label("Republic");

        Song song = new Song(title, date, performers, label, writer);
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(title, date, performers, label, writer));

        //Album
        Title albumTitle = new Title("The Life of a Showgirl");
        Performer albumPerformer = new Performer(new Person("Taylor Swift", "Taylor Swift"));
        ReleaseDate date2 = new ReleaseDate(LocalDate.of(2030, 11, 1));
        Label albumLabel = new Label("Republic");

        Album album = new Album(albumTitle, albumPerformer, date2, albumLabel, songs);

//        List<Song> list = album.addSongs(song);
//        List<Song> list = album.addSongs(song);

        //assertEquals for Song
        String expected = "The Fate of Ophelia - Taylor Swift (Taylor Swift); Writer: Taylor Swift (2025)";
        assertEquals(expected, song.toString());

        album.addSongs(song);
        List<Song> list = album.getSongs();
        assertEquals(1, list.size());
        assertEquals(song, list.get(0));

        //assertEquals for Album
        String expectedAlbum = "Album: The Life of a Showgirl, Performer: Taylor Swift (Taylor Swift), ReleaseDate: 2030, Label: Republic, Number of songs: 1";
        assertEquals(expectedAlbum, album.toString());

    }
    @Test
    public void testMultipleAddSong() {

        //Song
        Title title = new Title("The Fate of Ophelia");
        ReleaseDate date = new ReleaseDate(LocalDate.of(2025, 10, 3));
        ArrayList<Performer> performers = new ArrayList<>();
        performers.add(new Performer(new Person("Taylor Swift", "Taylor Swift")));
        Writer writer = new Writer(new Person("Taylor Swift", "Taylor Swift"));
        Label label = new Label("Republic");

        Song song = new Song(title, date, performers, label, writer);
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(title, date, performers, label, writer));

        //Album
        Title albumTitle = new Title("The Life of a Showgirl");
        Performer albumPerformer = new Performer(new Person("Taylor Swift", "Taylor Swift"));
        ReleaseDate date2 = new ReleaseDate(LocalDate.of(2030, 11, 1));
        Label albumLabel = new Label("Republic");

        Album album = new Album(albumTitle, albumPerformer, date2, albumLabel, songs);

//        List<Song> list = album.addSongs(song);
//        List<Song> list = album.addSongs(song);

        //assertEquals for Song
        String expected = "The Fate of Ophelia - Taylor Swift (Taylor Swift); Writer: Taylor Swift (2025)";
        assertEquals(expected, song.toString());

        album.addSongs(song);
        List<Song> list = album.getSongs();
        assertEquals(1, list.size());
        assertEquals(song, list.get(0));

        //assertEquals for Album
        String expectedAlbum = "Album: The Life of a Showgirl, Performer: Taylor Swift (Taylor Swift), ReleaseDate: 2030, Label: Republic, Number of songs: 1";
        assertEquals(expectedAlbum, album.toString());

    }
//    @Test
//    public void testAddMultiplePerformers() {
//        Title title = new Title("Test song");
//        ReleaseDate date = new ReleaseDate(LocalDate.of(2025, 1, 1));
//        Label label = new Label("Test label");
//        Writer writer = new Writer(new Person("Writer", "Writer"));
//        ArrayList<Performer> performers = new ArrayList<>();
//
//        Song song = new Song(title, date, performers, label, writer);
//
//
//        Performer performer1 = new Performer(new Person("Performer1", "Performer1StageName"));
//        Performer performer2 = new Performer(new Person("Performer2", "Performer2StageName"));
//
//        song.addPerformer(performer1);
//        song.addPerformer(performer2);
//
//        List<Performer> expected = List.of(performer1, performer2);
//        assertArrayEquals(expected.toArray(), song.getPerformers().toArray());
//
//    }






