import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    private List<String> kreiraj_lista(String ... elems){
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    public void test_za_every_statement(){
        List<String>return_lista=kreiraj_lista("#", "3", "#", "3", "#", "3", "#", "3", "#");
        RuntimeException ex;
        ex=assertThrows (RuntimeException.class, () -> SILab2.function(kreiraj_lista()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex=assertThrows(RuntimeException.class, () -> SILab2.function(kreiraj_lista("2", "3")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        assertEquals(return_lista, SILab2.function(kreiraj_lista("#", "1", "#", "1", "#", "1", "#", "1", "#" )));

    }

    @Test
    public void test_za_every_branch(){
        List<String>return_lista=kreiraj_lista("#", "3", "#", "3", "#", "3", "#", "3", "#");
        RuntimeException ex;
        ex=assertThrows (RuntimeException.class, () -> SILab2.function(kreiraj_lista()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex=assertThrows(RuntimeException.class, () -> SILab2.function(kreiraj_lista("2", "3")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        assertEquals(return_lista, SILab2.function(kreiraj_lista("#", "1", "#", "1", "#", "1", "#", "1", "#" )));

    }
}

