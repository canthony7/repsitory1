package com.zhbit1;

public class Car implements Comparable<Car>{
    String carCode;
    String brand;
    String mode;
    String color;
    int price;

    public Car(){

    }

    public Car(String carCode, String brand, String mode, String color, int price) {
        this.carCode = carCode;
        this.brand = brand;
        this.mode = mode;
        this.color = color;
        this.price = price;
    }

    @Override
    public int compareTo(Car car) {
        return car.price - this.price;
    }
}
