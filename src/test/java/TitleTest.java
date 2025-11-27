import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TitleTest {

    @Test
    void testTitle1(){
        Title title1 = new Title("HELP");
        assertEquals("HELP", title1.getTitle());
    }

    @Test
    void testTitle2() {
        Title title2 = new Title("24");
        assertEquals("24", title2.getTitle());
    }
}