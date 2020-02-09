package com.akadatsky;

public class Fruit {

    private double pricePerKg;
    private int weight;
    private FruitType type;
    private Color color;

    public Fruit() {
    }

    public Fruit(double pricePerKg, int weight, FruitType type, Color color) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.type = type;
        this.color = color;
    }

    //    public Fruit(double pricePerKg, int weight, FruitType type) {
//        this.pricePerKg = pricePerKg;
//        this.weight = weight;
//        this.type = type;
//    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public FruitType getType() {
        return type;
    }

    public void setType(FruitType type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public double getPrice() {
        return pricePerKg * weight / 1000.0;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "pricePerKg=" + pricePerKg +
                ", weight=" + weight +
                ", type=" + type +
                ", color=" + color +
                '}';
    }
}
