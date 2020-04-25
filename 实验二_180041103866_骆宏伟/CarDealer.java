package com.zhbit1;

import java.util.ArrayList;

public class CarDealer {
    String DealerName;
    ArrayList<Car> cars;

    public CarDealer(){

    }

    public CarDealer(String dealerName, ArrayList<Car> cars) {
        DealerName = dealerName;
        this.cars = cars;
    }

    void printinfo(){
        System.out.println(this.DealerName + "车行热销车辆");
        System.out.println("车号   品牌   类型   颜色   价格");
        System.out.println("========================================");
        for(Car car: cars){
            System.out.println(car.carCode + "  " + car.brand + "  " + car.mode + "  " + car.color + "  " + car.price);
        }
        System.out.println("**********************************************");
    }
}
