import java.time.LocalDate;

public class ReleaseDate {

    private final LocalDate releaseDate;

    public ReleaseDate(LocalDate releaseDate) {

        this.releaseDate = releaseDate;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public int getYear() {
        return releaseDate.getYear();
    }
}