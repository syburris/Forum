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
        File file = new File("posts.txt");

        ArrayList<Post> posts = loadPosts(file);
        Scanner consoleScanner = new Scanner(System.in);
        int replyID = -1;

        //loop over posts and print the ones with correct replyID
        while (true) {
            printPosts(posts,replyID);
            replyID = readID(consoleScanner);
        }
    }

    public static ArrayList<Post> loadPosts(File file) throws FileNotFoundException {
        //read all posts into memory
        ArrayList<Post> posts = new ArrayList<>();
        Scanner fileScanner = null;

        fileScanner = new Scanner(file);
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] columns = line.split("\\|");
            Post post = new Post(Integer.valueOf(columns[0]),columns[1],columns[2]);
            posts.add(post);
        }
        return posts;
    }

    public static void printPosts(ArrayList<Post> posts, int replyID){
        System.out.println("Posts replying to " + replyID);
        int id = 0;
        for (Post post : posts) {
            if (post.replyId == replyID) {
                System.out.printf("(%d) %s by %s\n", id, post.text, post.author);
            }
            id++;
        }
    }

    public static int readID(Scanner consoleScanner) {
        System.out.println("Please enter another reply ID");
        return Integer.valueOf(consoleScanner.nextLine());
    }




}
