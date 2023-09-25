package practice.Interpreter;

public class AndPermission implements PermissionExpression{
    private PermissionExpression expression1;
    private PermissionExpression expression2;

    public AndPermission(final PermissionExpression expression1, final PermissionExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override public boolean interpret(final User user) {
        return expression1.interpret(user) && expression2.interpret(user);
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("AndPermission{");
        sb.append("expression1=").append(expression1);
        sb.append(", expression2=").append(expression2);
        sb.append('}');
        return sb.toString();
    }
}
