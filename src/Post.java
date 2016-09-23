/**
 * Created by stevenburris on 9/23/16.
 */
public class Post {
    int replyId;
    String author;
    String text;
    int readCount;

    public Post(int replyId, String author, String text) {
        this.replyId = replyId;
        this.author = author;
        this.text = text;
        this.readCount = 0;
    }

    @Override
    public String toString() {
        readCount = readCount + 1;
        return "Post{" +
                "replyId=" + replyId +
                ", author='" + author + '\'' +
                ", text='" + text + '\'' +
                ", readCount=" + readCount +
                '}';
    }
}
