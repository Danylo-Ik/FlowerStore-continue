package ua.edu.ucu.apps.lab7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab7.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.lab7.flower.Flower;
import ua.edu.ucu.apps.lab7.flower.FlowerBucket;
import ua.edu.ucu.apps.lab7.flower.FlowerColor;
import ua.edu.ucu.apps.lab7.flower.FlowerPack;
import ua.edu.ucu.apps.lab7.flower.FlowerType;
import ua.edu.ucu.apps.lab7.flower.Item;
import ua.edu.ucu.apps.lab7.flower.Order;
import ua.edu.ucu.apps.lab7.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.lab7.payment.PayPalPaymentStrategy;

public class PaymentTest {
    
    @Test
    public void test() {
        Order order = new Order();
        order.setPayment(new CreditCardPaymentStrategy());
        order.setDelivery(new PostDeliveryStrategy());

        Item item = new Item();
        Flower flower1 = new Flower();
        flower1.setColor(FlowerColor.RED);
        flower1.setSepalLength(5.0);
        flower1.setFlowerType(FlowerType.ROSE);
        flower1.setPrice(5);
        FlowerBucket bucket = new FlowerBucket();
        bucket.add(new FlowerPack(flower1, 101));
        item.setFlowerBucket(bucket);
        order.addItem(item);

        order.setPayment(new CreditCardPaymentStrategy());
        assertEquals(order.getFinalPrice(), 615);

        order.setPayment(new PayPalPaymentStrategy());
        assertEquals(order.getFinalPrice(), 604);
    }
}
