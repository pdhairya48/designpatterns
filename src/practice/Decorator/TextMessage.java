package practice.Decorator;

public class TextMessage implements Message{

    private String msg;

    public TextMessage(final String msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return this.msg;
    }
}
