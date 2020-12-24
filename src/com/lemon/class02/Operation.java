package com.lemon.class02;

/**
 * @Description TODO
 * @Author Liyuan
 * @Date 2020/6/21
 * @Version 2.0
 */
public class Operation {
    public static void main(String[] args) {
        int x = 1;
        int y  = 2;
        System.out.println(x/y);    //值为0；1/2=0.5,小数部分会被省略，所以值为0
        System.out.println(y/x);    //值为2；2/1=2,值为整数，所以结果为2。
        System.out.println(x%y);  //值为1；1/2，商为0，余数为1；所以结果为余数1.
        System.out.println(y%x);  //值为0；2/1，商为2，余数为0；所以结果为0
    }
}
