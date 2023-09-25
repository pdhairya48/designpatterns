package practice.Strategy;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


public class Order {
    private String id;
    private LocalDate date;

    private Map<String,Double> items = new HashMap<>();

    private double total;

    public Order(final String id) {
        this.id = id;
        date = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(final LocalDate date) {
        this.date = date;
    }

    public Map<String, Double> getItems() {
        return items;
    }

    public void setItems(final Map<String, Double> items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(final double total) {
        this.total = total;
    }
}
