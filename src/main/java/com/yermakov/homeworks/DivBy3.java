package com.yermakov.homeworks;

import java.util.ArrayList;

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

