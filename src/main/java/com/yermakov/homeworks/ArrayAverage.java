package com.yermakov.homeworks;

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