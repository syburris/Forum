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
        ArrayList<Post> posts = Main.load("posts.txt");
        Scanner consoleScanner = new Scanner(System.in);
        int replyID = -1;

        //loop over posts and print the ones with correct replyID
        while (true) {
            int id = 0;
            for (Post post : posts) {
                if (post.replyId == replyID) {
                    System.out.printf("(%d) %s by %s\n", id, post.text, post.author);
                }
                id++;
            }
            System.out.println("Please enter another reply ID");
            replyID = Integer.valueOf(consoleScanner.nextLine());
        }
    }

    public static ArrayList<Post> load( String filename){
        ArrayList<Post> posts = new ArrayList<>();

        //read all posts into memory
        File file = new File(filename);
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(file);
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                String[] columns = line.split("\\|");
                Post post = new Post(Integer.valueOf(columns[0]),columns[1],columns[2]);
                posts.add(post);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return posts;
    }




}
