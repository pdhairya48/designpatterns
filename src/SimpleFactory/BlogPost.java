package SimpleFactory;

public class BlogPost implements Post{
    @Override public String message() {
        return "This is Blog Post";
    }
}
