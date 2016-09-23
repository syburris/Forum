import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by stevenburris on 9/23/16.
 */
public class PostTest {
    @Test
    public void testToString() throws Exception {
        //Given
        Post p = new Post(-1,"tester","this is a test");

        //If
        p.toString();

        //Then
        assertTrue("Read count should be set to 0 and increment by one each time the toString() method is called",
                p.readCount == 1);
        //If
        p.toString();

        //Then
        assertTrue("Read count should be set to 0 and increment by one each time the toString() method is called",
                p.readCount == 2);


    }

}