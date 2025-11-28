import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerformerTest {

    @Test
    void testGetPerformer(){
        Performer performer = new Performer (new Person("Eduarda", "Lil' Edu"));
        assertEquals("Eduarda", performer.getPerformer().getName());
        assertEquals("Lil' Edu", performer.getPerformer().getStageName());
    }

    @Test
    void testGetPerformer1(){
        Performer performer = new Performer (new Person("Vivian Sandler", "The Vivster"));
        assertEquals("Vivian Sandler", performer.getPerformer().getName());
        assertEquals("The Vivster", performer.getPerformer().getStageName());
    }

    @Test
    void testGetPerformer2(){
        Performer performer = new Performer (new Person( "Curtis James Jackson III", "50 Cent"));
        assertEquals("Curtis James Jackson III", performer.getPerformer().getName());                        //These might be redundant!!!!
        assertEquals("50 Cent", performer.getPerformer().getStageName());
    }

}