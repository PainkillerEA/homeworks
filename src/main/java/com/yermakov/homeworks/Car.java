package com.yermakov.homeworks;

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
