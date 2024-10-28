package ua.edu.ucu.apps.lab7.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Flower {
    private double price;
    private FlowerSpec flowerSpec;

    public Flower() {
        this.price = 0;
        this.flowerSpec = new FlowerSpec();
    }

    public Flower(Flower flower) {
        this.price = flower.price;
        this.flowerSpec = flower.flowerSpec;
    }

    public String getColor() {
        return flowerSpec.getColor().toString();
    }

    public double getSepalLength() {
        return flowerSpec.getSepalLength();
    }

    public String getFlowerType() {
        return flowerSpec.getFlowerType().toString();
    }

    public boolean matches(FlowerSpec otherSpec) {
        return flowerSpec.matches(otherSpec);
    }

    public void setColor(FlowerColor color) {
        flowerSpec.setColor(color);
    }

    public void setSepalLength(double sepalLength) {
        flowerSpec.setSepalLength(sepalLength);
    }

    public void setFlowerType(FlowerType flowerType) {
        flowerSpec.setFlowerType(flowerType);
    }

}
