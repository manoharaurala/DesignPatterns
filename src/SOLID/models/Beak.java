package SOLID.models;


public abstract class Beak {
    private Double strength;
    private String material;

    public Beak(Double strength, String material) {
        this.strength = strength;
        this.material = material;
    }

    public Double getStrength() {
        return strength;
    }

    public String getMaterial() {
        return material;
    }
}
