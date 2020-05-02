package com.yermakov.homeworks;

import java.util.ArrayList;

class MyList<T extends Number> {
    private ArrayList<T> myList = new ArrayList<>();

    private T add(T value) {
        myList.add(value);
        return value;
    }

    private T minValue() {
        T min = myList.get(0);
        for (int i = 0; i < myList.size(); i++) {
            if ((Integer) min > (Integer) myList.get(i)) {
                min = myList.get(i);
            }
        }
        return min;
    }

    private T maxValue() {
        T max = myList.get(0);
        for (int i = 0; i < myList.size(); i++) {
            if ((Integer) max < (Integer) myList.get(i)) {
                max = myList.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(78);
        myList.add(558);
        myList.add(48);
        myList.add(7);
        myList.add(75);
        System.out.println("The smallest value is " + myList.minValue());
        System.out.println("The largest value is " + myList.maxValue());
    }
}