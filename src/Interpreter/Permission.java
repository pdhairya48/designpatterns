package Interpreter;

public class Permission implements PermissionExpression{

    private String permission;

    public Permission(String permission){
        this.permission = permission.toLowerCase();
    }

    @Override public boolean interpret(final User user) {
        return user.getPermissions().contains(permission);
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("Permission{");
        sb.append("permission='").append(permission).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
