package SOLID.models;

import SOLID.enums.BirdType;
import SOLID.enums.Colour;
import SOLID.enums.Size;


public abstract class Bird {

    private Integer weight;
    private Colour colour;
    private Size size;
    private String beakType;
    private BirdType type;

    public Bird(Integer weight, Colour colour, Size size, String beakType, BirdType type) {
        this.weight = weight;
        this.colour = colour;
        this.size = size;
        this.beakType = beakType;
        this.type = type;
    }

    public void eat(){
        System.out.println("Bird is so Hungry and Eating now");
    }

    public void sleep(){
        System.out.println("Bird is sleeping now");
    }

    public Integer getWeight() {
        return weight;
    }

    public Colour getColour() {
        return colour;
    }

    public Size getSize() {
        return size;
    }

    public String getBeakType() {
        return beakType;
    }

    public BirdType getType() {
        return type;
    }
}
