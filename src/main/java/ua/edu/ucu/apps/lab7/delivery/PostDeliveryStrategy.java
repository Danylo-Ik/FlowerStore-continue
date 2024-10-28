package ua.edu.ucu.apps.lab7.delivery;

public class PostDeliveryStrategy implements Delivery {
    public double deliver(double price) {
        if (price > 1000){
            return price + 0;
        } else {
            return price + 100;
        }
    }
    
}
