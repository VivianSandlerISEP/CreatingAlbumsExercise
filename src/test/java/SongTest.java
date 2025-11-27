import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongTest {

    // Test to Construtor
    @Test
    void ConstrutorInicialized() {
        LocalDate date = LocalDate.of(2025, 10, 3);
        Song song = new Song("The Fate of Ophelia", date,"Taylor Swift", "Republic", "Taylor Swift and Max Martin");

        assertEquals("The Fate of Ophelia", song.getSongTitle());
        assertEquals("Taylor Swift and Max Martin", song.getWriter());
        assertEquals("Taylor Swift", song.getPerformers());
        assertEquals(date, song.getReleaseDate());
        assertEquals("Republic", song.getLabelName());
    }


    // Test to method toString
    @Test
    void testToStringReturnsExpectedFormat() {
        LocalDate date = LocalDate.of(2025, 10, 3);
        Song song = new Song("Elizabeth Taylor", date, "Taylor Swift","Republic", "Taylor Swift  and Max Martin");

        String expected = "Elizabeth Taylor - Taylor Swift (2025)";
        assertEquals(expected, song.toString());
    }
}
