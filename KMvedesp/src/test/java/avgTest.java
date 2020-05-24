
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sample.avg;

import static org.junit.jupiter.api.Assertions.*;

public class avgTest {

    avg underTest;

    @BeforeEach
    void setUp() {

        underTest = new avg();
    }

    @Test
    void testavgMark(){
        assertEquals(5,avg.avgMark(1,5));
    }
}
