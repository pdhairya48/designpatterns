package Decorator;

public class Client {

    public static void main(String[] args) {
        Message m= new TextMessage("HELLO");
        Message base64=new Base64Message(m);
        System.out.println(m.getContent());
        System.out.println(base64.getContent());

    }
}
