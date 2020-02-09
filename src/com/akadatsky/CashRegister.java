package com.akadatsky;

public class CashRegister {

    private Fruit[] fruits;

    public CashRegister(Fruit[] fruits) {
        this.fruits = fruits;
    }

    public void printBill() {
        double sum = 0;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] != null) {
                sum += fruits[i].getPrice();
            }
        }
        System.out.printf("\nTotal: %s", String.format("%.2f" , sum));
    }

}
