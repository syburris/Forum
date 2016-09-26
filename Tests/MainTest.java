import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by stevenburris on 9/26/16.
 */
public class MainTest {
    @Test
    public void testLoad() throws FileNotFoundException {
        // Given
        File f = new File("posts.txt");

        // When

        ArrayList<Post> posts = Main.loadPosts(f);

        // Then

        assertFalse(posts.isEmpty());


    }

    @Test
    public void readID() {
        // Given
        String input = "2";

        // When

        int replyID = Main.readID("2");

        // Then
        assertTrue(replyID == 2);
    }

}