package practice.Command;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        EWSService service = new EWSService();

        Command c1 = new AddMemberCommand(service,"a@a.com", "spam");
        MailTasksRunner.getInstance().addCommand(c1);

        Command c2 = new AddMemberCommand(service,"b@b", "spam");
        MailTasksRunner.getInstance().addCommand(c2);

        Thread.sleep(3000);
        MailTasksRunner.getInstance().shutdown();
    }
}
