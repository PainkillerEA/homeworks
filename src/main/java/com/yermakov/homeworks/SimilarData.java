package com.yermakov.homeworks;

import java.util.ArrayList;

class SimilarData {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("Apple");
        list1.add("Orange");
        list1.add("Grapefruit");
        list1.add("Banana");
        list1.add("Pineapple");
        list1.add("Lemon");
        ArrayList list2 = new ArrayList();
        list2.add("Cucumber");
        list2.add("Tomato");
        list2.add("Potato");
        list2.add("Apple");
        list2.add("Carrot");
        list2.add("Broccoli");
        list2.add("Pineapple");
        for (int i = 0; i < list1.size(); i++) {
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (list1.get(i).equals(list2.get(i2))) {
                    System.out.println("Element with index " + i + " in list1 is the same as element with index " + i2 + " in list2");
                }
            }
        }
    }
}