package ua.edu.ucu.apps.lab7.flower;

import java.util.List;
import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.lab7.delivery.Delivery;
import ua.edu.ucu.apps.lab7.payment.Payment;

@AllArgsConstructor
@Getter
@Setter
public class Order {
    private List<Item> items = new ArrayList<Item>();
    private Payment payment;
    private Delivery delivery;

    public Order() {
        this.items = new ArrayList<Item>();
    }


    public void addItem(Item item) {
        items.add(item);
    }

    public double getFinalPrice() {
        double finalPrice = 0;
        for (Item item : items) {
            finalPrice += item.getFlowerBucket().getPrice();
        }
        finalPrice = payment.pay(finalPrice);
        finalPrice = delivery.deliver(finalPrice);
        
        return finalPrice;
    }
}
