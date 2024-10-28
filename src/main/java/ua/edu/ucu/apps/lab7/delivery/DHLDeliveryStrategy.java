package ua.edu.ucu.apps.lab7.delivery;

public class DHLDeliveryStrategy implements Delivery {
    public double deliver(double price) {
        return price + 10;
    }
    
}
