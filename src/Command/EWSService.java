package Command;

public class EWSService {
    public void addMember(String contact, String contactGroup){
        System.out.println("Added Contact"+contact+"to"+contactGroup);
    }
    public void removeMember(String contact, String contactGroup){
        System.out.println("Removed"+ contact +"from "+contactGroup);
    }
}
