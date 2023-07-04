package SimpleFactory;

public class SimpleFactory {

    public static Post getPost(String name){
        if(name.equals("news")){
            return new NewsPost();
        }
        else{
            return new BlogPost();
        }
    }
}
