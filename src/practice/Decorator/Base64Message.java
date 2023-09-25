package practice.Decorator;

public class Base64Message implements Message{

    Message message;
    Base64Message(Message message){
        this.message=message;
    }
    @Override
    public String getContent() {
        return message.getContent().toLowerCase();
    }
}
