package com.akadatsky;

public class Main {

    public static void main(String[] args) {

        Fruit lemon = new Fruit();
        lemon.setType(FruitType.LEMON);
        lemon.setColor(Color.YELLOW);
        lemon.setPricePerKg(26.90);
        lemon.setWeight(134);
        // System.out.println(lemon);

        Fruit banana = new Fruit(29.90, 196, FruitType.BANANA, Color.YELLOW);
        // System.out.println(banana);

        Fruit redApple = new Fruit(11.90, 176, FruitType.APPLE, Color.RED);
        //  System.out.println(redApple);

        Fruit greenApple = new Fruit(13.50, 202, FruitType.APPLE, Color.GREEN);
        //  System.out.println(greenApple);

        Fruit[] fruits = new Fruit[4];
        fruits[0] = lemon;
        fruits[1] = banana;
        fruits[2] = redApple;
        fruits[3] = greenApple;


        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] != null) {
                System.out.printf(fruits[i].getType() + " " + fruits[i].getColor() + " price: %sKg x %s = %s\n", fruits[i].getWeight() / 1000.0, fruits[i].getPricePerKg(), String.format("%.2f", fruits[i].getPrice()));
            }
        }

        CashRegister cashRegister = new CashRegister(fruits);
        cashRegister.printBill();
    }
}
