package models;

import enums.BirdType;
import enums.Colour;
import enums.Size;


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

    public abstract void fly();

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
