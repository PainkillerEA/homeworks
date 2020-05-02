package com.yermakov.homeworks;

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