package practice.Observer;

public class PriceObserver implements OrderObserver {
    @Override public void updated(final Order order) {
        double total = order.getItemCost();
        if(total >= 500){
            order.setDiscount(20);
        }else if(total >= 200){
            order.setDiscount(10);
        }
    }

}
