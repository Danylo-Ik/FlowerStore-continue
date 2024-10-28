package ua.edu.ucu.apps.lab7.payment;

public class PayPalPaymentStrategy implements Payment{
    
        @Override
        public double pay(double price) {
            System.out.println("PayPal payment");
            return price - 1;
        }
}
