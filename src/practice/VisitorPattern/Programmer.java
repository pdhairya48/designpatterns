package practice.VisitorPattern;

public class Programmer extends AbstractEmployee{
    private String skills;

    protected Programmer(final String name,String skills) {
        super(name);
        this.skills=skills;
    }

    public String getSkills() {
        return skills;
    }

    @Override public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
