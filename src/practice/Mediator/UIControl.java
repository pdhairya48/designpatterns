package practice.Mediator;

public interface UIControl {
    void controlChanged(UIControl uiControl);
    String getControlValue();
    String getControlName();
}
