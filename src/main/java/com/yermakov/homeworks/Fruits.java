package com.yermakov.homeworks;

import java.util.ArrayList;

class Fruits {
    public static void main(String[] args) {
        ArrayList fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grapefruit");
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Lemon");
        System.out.println(fruits);
        System.out.println();
        boolean isPresent = false;
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i) == "Orange") {
                fruits.set(i, "Grapefruit");
                isPresent = true;
            }
        }
        if (isPresent) {
            System.out.println(fruits);
        } else {
            System.out.println("There is no value to replace");
        }
    }
}