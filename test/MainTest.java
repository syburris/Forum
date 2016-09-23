import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by stevenburris on 9/23/16.
 */
public class MainTest {
    @Test
    public void testLoad() throws Exception {
        // Given
        String filename = "./test/post.txt";
        /* Content of that file should be
            ```
            -1|alice|Hey guys!
            -1|bob|This is a new discussion
            ```
         */

        // If / When
        ArrayList<Post> posts = Main.load(filename);

        // Then
        assertTrue(posts.get(0).getClass().equals(Post.class));
        assertTrue(posts.get(0).author.equals("alice"));

    }

}