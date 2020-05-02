package com.yermakov.homeworks;

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