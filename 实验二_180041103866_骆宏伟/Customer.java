package com.zhbit1;

import java.util.HashMap;
import java.util.Set;

public class Customer{
    String CustomerName;
    HashMap<String, Car> cars;

    public Customer(){

    }

    public Customer(String customerName, HashMap<String, Car> cars) {
        CustomerName = customerName;
        this.cars = cars;
    }

    void printinfo(){
        Set<String> set = this.cars.keySet();
        System.out.println("第 "+ Args.i +" 个顾客：" + this.CustomerName + " 所买车：");
        System.out.println("车号   品牌   类型   颜色   价格");
        System.out.println("========================================");
        for(String key:set){
            Car car = this.cars.get(key);
            System.out.println(car.carCode + "  " + car.brand + "  " + car.mode + "  " + car.color + "  " + car.price);
        }
        System.out.println("**********************************************");
        Args.i++;
    }
}
