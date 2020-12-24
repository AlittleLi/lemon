package com.lemon.class04;

/**
 * @Description TODO
 * @Author Liyuan
 * @Date 2020/7/1
 * @Version 2.0
 */
public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.printSum(3,4);
        calculator.printDvalue(3,4);
        calculator.printProduct(3,4);
        calculator.printDivision(3,4);
    }

    public  void printSum(int a ,int b){
        System.out.println("和为："+(a + b));
    }
    public  void printDvalue(int a ,int b){
        System.out.println("差为："+(a - b));
    }
    public void printProduct(int a, int b){
        System.out.println("积为："+(a * b));
    }
    public void printDivision(int a, int b){
        System.out.println("商为："+(a / b));
    }
}
