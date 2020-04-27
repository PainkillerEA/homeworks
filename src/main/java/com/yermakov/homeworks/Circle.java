package com.yermakov.homeworks;

import java.util.ArrayList;

class Circle {
    public static void main(String[] args) {
        Circle Circle = new Circle();
        Circle.calculateArea(8);
    }

    double calculateArea(double radius) {
        double area = Math.PI * (radius * radius);
        System.out.println(area);
        return area;
    }
}

class Objects {
    private static int count = 0;

    private Objects() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Objects a = new Objects();
        Objects b = new Objects();
        Objects c = new Objects();
        Objects d = new Objects();
    }
}

class Car {
    double speed = 0;

    private void start() {
        System.out.println("Машина завелась");
    }

    private double drive() {
        speed = speed + 10;
        System.out.println("Машина поехала, текущяя скорость - " + speed + " км/ч");
        return speed;
    }

    private double faster(double increase) {
        speed += increase;
        if (speed < 180) {
            System.out.println("Машина ускорилась, текущяя скорость - " + speed + " км/ч");
        } else {
            speed = 180;
            System.out.println("Достигнута максимальная скорость");
        }
        return speed;
    }

    private double slower(double decrease) {
        speed -= decrease;
        if (speed > 0) {
            System.out.println("Машина замедлилась, текущая скорость - " + speed + " км/ч");
        } else {
            speed = 0;
            System.out.println("Машина остановилась");
        }
        return speed;
    }

    private double stop() {
        speed = 0;
        System.out.println("Мотор заглушен");
        return speed;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();
        car.faster(70);
        car.faster(170);
        car.slower(170);
        car.stop();
    }
}

class ArrayReverse {
    public static void main(String[] args) {
        int array[] = {2, 3, 1, 7, 11};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

class ArraySum {
    private static int sum;

    public static void main(String[] args) {
        int array[] = {-5, -15, 67, 21, -78, -15, 30};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum = sum + array[i];
            } else {
            }
        }
        System.out.println(sum);
    }

}

class ArrayAverage {
    private static double sum;

    public static void main(String[] args) {
        double array[] = {4, 5, 9, 78, 2, 32, 66, 5, 9, 12};
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double average = sum / array.length;
        System.out.println(average);
    }
}

class ArrayDuplicatesExecutor {
    public static void main(String[] args) {
        int array[] = {3, 2, 3, 1, 4, 2, 8, 3};
        for (int i = 0; i < array.length; i++) {
            for (int u = 0; u < i; u++) {
                if (array[i] == array[u]) {
                    array[i] = 0;
                }
            }
            System.out.print(array[i] + " ");
        }
    }
}

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

class DivBy3 {
    public static void main(String[] args) {
        ArrayList values = new ArrayList();
        values.add(3);
        values.add(9);
        values.add(11);
        values.add(18);
        values.add(20);
        values.add(22);
        for (int i = 0; i < values.size(); i++) {
            if ((int) values.get(i) % 3 == 0) {
                values.remove(i);
                i--;
            }
        }
        System.out.println(values);
    }
}

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