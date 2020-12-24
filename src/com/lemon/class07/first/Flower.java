package com.lemon.class07.first;

/**
 * @Description TODO
 * @Author Liyuan
 * @Date 2020/7/9
 * @Version 2.0
 */
public class Flower {

    public static void main(String[] args) {
        flower();
    }

    public static void flower(){
        for (int  i =100; i<1000;i++){
            int a =  i / 100;
            int b = ( i / 10 ) % 10;
            int c = i % 10;
            if (i ==Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)){
                System.out.println(i);
            }
        }
    }
}
