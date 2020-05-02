package com.yermakov.homeworks;

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
