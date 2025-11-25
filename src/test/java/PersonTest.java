import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PersonTest {

    @Test
    void testGetName(){
        Person person = new Person ("Eduarda", "Lil' Edu");
        assertEquals("Eduarda", person.getName());
        assertEquals("Lil' Edu", person.getStageName());
    }

    @Test
    void testGetName2(){
        Person person = new Person ("Vivian Sandler", "The Vivster");
        assertEquals("Vivian Sandler", person.getName());
        assertEquals("The Vivster", person.getStageName());
    }

    @Test
    void testGetName3(){
        Person person = new Person ("Curtis James Jackson III", "50 Cent");
        assertEquals("Curtis James Jackson III", person.getName());
        assertEquals("50 Cent", person.getStageName());
    }
}