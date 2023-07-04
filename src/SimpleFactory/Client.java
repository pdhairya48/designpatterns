package SimpleFactory;

public class Client {
    public static void main(String[] args) {
        Post post=SimpleFactory.getPost("blog");
        System.out.println(post.message());
    }
}
