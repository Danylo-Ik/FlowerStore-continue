package ua.edu.ucu.apps.lab7.flower;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    private FlowerBucket flowerBucket;

    public double getPrice() {
        return flowerBucket.getPrice();
    }

    public String getDescription() {
        return "Simple Item.";
    }  
}
