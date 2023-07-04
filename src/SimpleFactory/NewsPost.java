package SimpleFactory;

public class NewsPost implements Post{
    @Override public String message() {
        return "This is News Post";
    }
}
