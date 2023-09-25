package practice.Mediator;

import java.util.ArrayList;
import java.util.List;


public class UIMediator {

    List<UIControl> colleague = new ArrayList<>();

    public void register(UIControl uiControl){
        colleague.add(uiControl);
    }

    public void valueChange(UIControl uiControl){
        colleague.stream().filter(uiControl1 -> uiControl1!=uiControl).forEach(value->{
            value.controlChanged(uiControl);
        });
    }

}
