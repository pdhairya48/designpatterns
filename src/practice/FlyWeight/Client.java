package practice.FlyWeight;

public class Client {
    public static void main(String[] args) {
        SystemErrorMessage msg1 = ErrorMessageFactory.getInstance().getError(ErrorMessageFactory.ErrorType.GenericSystem);
        String result=msg1.getText(" 429 ");
        System.out.println(result);

        //Unshared can be like this, here the instance is not generated from flyweight.
        SystemErrorMessage s1 = new SystemErrorMessage("hellp $errorCode","url");
        String r=s1.getText("345");
        System.out.println(r);

        /*
        * Notes :
        1. A factory is always necessary with flyweight design pattern as client code needs easy way to get hold of
        * shared flyweight. Also number of shared instances can be large so a central place is good strategy to keep
        * track of all of them.

        2. Flyweight's intrinsic state should be immutable for successful use of flyweight pattern.
         */
    }
}
