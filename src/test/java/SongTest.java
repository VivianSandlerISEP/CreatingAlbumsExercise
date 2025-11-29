import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongTest {

    // Test to Construtor
    @Test
    void construtorInicialized() {

        Title title = new Title("The Fate of Ophelia");
        ReleaseDate date = new ReleaseDate(LocalDate.of(2025, 10, 3));
        Writer writer = new Writer(new Person("Taylor Swift and Max Martin", "TSwift and Marty M"));
        ArrayList<Performer> performers = new ArrayList<>();
        performers.add(new Performer(new Person("Taylor Swift", "Taylor Swift")));
        Label label = new Label("Republic");

        Song song = new Song(title, date, performers, label, writer);

        assertEquals("The Fate of Ophelia", song.getSongTitle().getTitle());
        // Below line may need to be changes .getWriter() -> .getPerson()
        assertEquals("Taylor Swift and Max Martin", song.getSongWriter().getWriter().getName());
        // Class Song  - >  Class Writer - > Class Person
        // Below line may need to be changes .getWriter() -> .getPerson()
        assertEquals("TSwift and Marty M", song.getSongWriter().getWriter().getStageName());

        //Class Song  - > Class Performer - > Class Person
        // returns ArrayList - > returns Person - > returns String
        assertEquals("Taylor Swift", song.getPerformers().get(0).getPerformer().getName());
        assertEquals("Taylor Swift", song.getPerformers().get(0).getPerformer().getStageName());
        assertEquals(date, song.getReleaseDate());
        // Class Song    - >   Class Label
        assertEquals("Republic", song.getLabel().getlabelName());
    }

    @Test
    public void testAddPerformer() {
        Title title = new Title("Test song");
        ReleaseDate date = new ReleaseDate(LocalDate.of(2025, 1, 1));
        Label label = new Label("Test label");
        Writer writer = new Writer(new Person("Writer", "Writer"));
        ArrayList<Performer> performers = new ArrayList<>();

        Song song = new Song(title, date, performers, label, writer);
        Performer performer1 = new Performer(new Person("Performer1", "Performer1StageName"));

        song.addPerformer(performer1);

        List<Performer> list = song.getPerformers();
        assertEquals(1, list.size());
        assertEquals(performer1, list.get(0));

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
}
