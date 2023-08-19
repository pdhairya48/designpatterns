package Mediator;

public class TextBox implements UIControl{

    UIMediator uiMediator;
    public TextBox(UIMediator mediator){
        this.uiMediator=mediator;
        System.out.println("This is textbox");
        this.uiMediator.register(this);
    }

    @Override public void controlChanged(final UIControl uiControl) {

    }

    @Override public String getControlValue() {
        return null;
    }

    @Override public String getControlName() {
        return null;
    }
}
