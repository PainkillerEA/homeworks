package com.yermakov.homeworks;

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













