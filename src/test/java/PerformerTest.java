import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerformerTest {

    @Test
    void testGetPerformer(){
        Performer performer = new Performer (new Person("Eduarda", "Lil' Edu"));
        assertEquals("Eduarda", performer.getPerson().getName());
        assertEquals("Lil' Edu", performer.getPerson().getStageName());
    }

    @Test
    void testGetPerformer1(){
        Performer performer = new Performer (new Person("Vivian Sandler", "The Vivster"));
        assertEquals("Vivian Sandler", performer.getPerson().getName());
        assertEquals("The Vivster", performer.getPerson().getStageName());
    }

    @Test
    void testGetPerformer2(){
        Performer performer = new Performer (new Person( "Curtis James Jackson III", "50 Cent"));  //just testing if this works
        assertEquals("50 Cent (Curtis James Jackson III)", performer.getPerson());
    }

}