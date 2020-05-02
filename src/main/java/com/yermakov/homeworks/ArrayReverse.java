package com.yermakov.homeworks;

class ArrayReverse {
    public static void main(String[] args) {
        int array[] = {2, 3, 1, 7, 11};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}