import javafx.geometry.Pos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by stevenburris on 9/23/16.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Post> posts = new ArrayList<>();

        //read all posts into memory
        File file = new File("posts.txt");
        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] columns = line.split("\\|");
            Post post = new Post(Integer.valueOf(columns[0]),columns[1],columns[2]);
            posts.add(post);
        }

    }
}
