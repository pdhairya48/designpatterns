package practice.Interpreter;

public class Report {
    private String name;
    private String permission;

    //"not admin","finance_user and admin"
    public Report(final String name, final String permission) {
        this.name = name;
        this.permission = permission;
    }

    public String getName() {
        return name;
    }

    public String getPermission() {
        return permission;
    }
}
