package ua.edu.ucu.apps.lab7.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
public class FlowerSpec {
    private FlowerColor color;
    private double sepalLength;
    private FlowerType flowerType;

    public FlowerSpec() {
        this.color = null;
        this.sepalLength = 0;
        this.flowerType = null;
    }

    public boolean matches(FlowerSpec otherSpec) {
        if (color != otherSpec.color) {
            return false;
        }
        if (flowerType != otherSpec.flowerType) {
            return false;
        }
        if (sepalLength != otherSpec.sepalLength) {
            return false;
        }
        return true;
    }

}
