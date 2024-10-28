package ua.edu.ucu.apps.lab7.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.lab7.flower.Flower;
import ua.edu.ucu.apps.lab7.flower.FlowerColor;
import ua.edu.ucu.apps.lab7.flower.FlowerType;

@RestController
@RequestMapping("/api/v1")
public class FlowerController {

    @GetMapping("/flowers")
    public List<Flower> getFlowers() {
        Flower flower1 = new Flower();
        flower1.setColor(FlowerColor.RED);
        flower1.setSepalLength(5.0);
        flower1.setFlowerType(FlowerType.ROSE);
        flower1.setPrice(5);
        Flower flower2 = new Flower();
        flower2.setColor(FlowerColor.BLUE);
        flower2.setSepalLength(6.0);
        flower2.setFlowerType(FlowerType.TULIP);
        flower2.setPrice(6);
        return List.of(flower1, flower2);
    }
}