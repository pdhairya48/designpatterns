package Command;

public class AddMemberCommand implements Command{

    private EWSService ewsService;
    private String emailAddress;
    private String listName;

    public AddMemberCommand(final EWSService ewsService, final String emailAddress, final String listName) {
        this.ewsService = ewsService;
        this.emailAddress = emailAddress;
        this.listName = listName;
    }

    @Override
    public void execute() {
        ewsService.addMember(emailAddress,listName);
    }
}
