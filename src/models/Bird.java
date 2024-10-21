package models;

import enums.BirdType;


public abstract class Bird {

    private Integer weight;
    private String colour;
    private String size;
    private String beakType;
    private BirdType type;

    public Bird(Integer weight, String colour, String size, String beakType, BirdType type) {
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

    public String getColour() {
        return colour;
    }

    public String getSize() {
        return size;
    }

    public String getBeakType() {
        return beakType;
    }

    public BirdType getType() {
        return type;
    }
}
