package com.zhbit1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Text01 {

    public static int i = 0;
    public static void main(String[] args) {
        //丰田

        Car car1 = new Car("CS4634", "丰田", "皇冠", "灰色", 210000);
        Car car2 = new Car("CS1678", "丰田", "佳美", "白色", 200000);
        Car car3 = new Car("CS7789", "丰田", "科罗拉", "蓝色", 180000);
        ArrayList<Car> cars1 = new ArrayList<Car>();
        cars1.add(car1);
        cars1.add(car2);
        cars1.add(car3);
        CarDealer dealer1 = new CarDealer("广汽丰田", cars1);

        //本田
        Car car4 = new Car("CS9234", "本田", "雅阁", "黑色", 220000);
        Car car5 = new Car("CS2344", "本田", "飞度", "红色", 170000);
        Car car6 = new Car("CS6577", "本田", "思域", "银色", 150000);
        ArrayList<Car> cars2 = new ArrayList<Car>();
        cars2.add(car4);
        cars2.add(car5);
        cars2.add(car6);
        CarDealer dealer2 = new CarDealer("广汽本田", cars2);

        //别克
        Car car7 = new Car("CS7689", "别克", "君威", "银色", 250000);
        Car car8 = new Car("CS4356", "别克", "凯越", "黑色", 240000);
        Car car9 = new Car("CS8122", "别克", "阅朗", "红色", 230000);
        ArrayList<Car> cars3 = new ArrayList<Car>();
        cars3.add(car7);
        cars3.add(car8);
        cars3.add(car9);
        CarDealer dealer3 = new CarDealer("上汽别克",cars3);

        //排序
        Collections.sort(cars1);
        Collections.sort(cars2);
        Collections.sort(cars3);

        //输出
        dealer1.printinfo();
        dealer2.printinfo();
        dealer3.printinfo();
        System.out.println();

        //顾客1的车
        HashMap<String, Car> carHashMap1 = new HashMap<String, Car>();
        carHashMap1.put("20200406", car4);
        carHashMap1.put("20200407", car1);

        //顾客2的车
        HashMap<String, Car> carHashMap2 = new HashMap<String, Car>();
        carHashMap2.put("20200408", car9);
        carHashMap2.put("20200409", car3);

        //创建顾客对象
        Customer customer1 = new Customer("李明", carHashMap1);
        Customer customer2 = new Customer("吴浩强", carHashMap2);

        //输出
        customer1.printinfo();
        customer2.printinfo();

    }
}
