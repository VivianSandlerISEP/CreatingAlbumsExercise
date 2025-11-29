import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ReleaseDateTest {

    @Test
    void getReleaseDateReturnsValueFromConstructor() {

        ReleaseDate releaseDate = new ReleaseDate(LocalDate.of(2025, 12, 25));

        LocalDate expected = LocalDate.of(2025, 12, 25);
        LocalDate actual = releaseDate.getReleaseDate();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetYear() {

        ReleaseDate releaseDate = new ReleaseDate(LocalDate.of(2026, 1, 1));

        int actual = releaseDate.getYear();
        assertEquals(2026, actual);
    }
}