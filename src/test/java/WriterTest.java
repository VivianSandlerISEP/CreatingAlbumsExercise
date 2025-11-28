import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WriterTest {

    @Test
    void testGetWriter() {
        Person person = new Person ("Eduarda", "Lil' Edu");
        Writer writer1 = new Writer(person);
        assertEquals("Eduarda", writer1.getWriter().getName());

    }

    @Test
    void testGetStageNameWriter2() {
        Person person = new Person ("Vivian Sandler", "The Vivster");
        Writer writer2 = new Writer (person);
        assertEquals("The Vivster", writer2.getWriter().getStageName());
        assertEquals("Vivian Sandler", writer2.getWriter().getName());
    }

    @Test
    void testGetNameWriter3() {
        Person person = new Person ("Curtis James Jackson III", "50 Cent");
        Writer writer3 = new Writer(person);
        assertEquals("Curtis James Jackson III", writer3.getWriter().getName());
    }

}