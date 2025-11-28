import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void testGetName(){
        Person person = new Person ("Eduarda", "Lil' Edu", 26);
        assertEquals("Eduarda", person.getName());
        assertEquals("Lil' Edu", person.getStageName());
        assertEquals(26, person.getAge());
    }

    @Test
    void testGetName2(){
        Person person = new Person ("Vivian Sandler", "The Vivster", 27);
        assertEquals("Vivian Sandler", person.getName());
        assertEquals("The Vivster", person.getStageName());
        assertEquals(27, person.getAge());
    }

    @Test
    void testGetName3(){
        Person person = new Person ("Curtis James Jackson III", "50 Cent", 50);
        assertEquals("Curtis James Jackson III", person.getName());
        assertEquals("50 Cent", person.getStageName());
        assertEquals(50, person.getAge());
    }
}