package AdapterPattern;

public class BusinessCard {
    public String designCard(CustomerName customerName){
        String card="";
        card+="\n"+customerName.getDesignation();
        card+=customerName.getName();
        card+=customerName.getAddress();
        return card;

    }
}
