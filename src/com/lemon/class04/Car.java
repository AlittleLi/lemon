package com.lemon.class04;

/**
 * @Description TODO
 * @Author Liyuan
 * @Date 2020/7/1
 * @Version 2.0
 */
public class Car {
    String color;
    int wheel;
    String name;
    public void carStart(){
        System.out.println("汽车启动了");
    }
    public void carStop(){
        System.out.println("汽车停下来了");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.color = "黑色";
        System.out.println("颜色为："+car.color);
        car.wheel = 4;
        System.out.println("轮胎数量为："+car.wheel);
        car.name = "库里南";
        System.out.println("厂商为："+car.name);
        car.carStart();
        car.carStop();

    }


}
