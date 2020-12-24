package com.lemon.class07.first;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author Liyuan
 * @Date 2020/7/9
 * @Version 2.0
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        System.out.println("九九乘法表：");
        for(int i = 1; i<=9;i++){
           for (int j = 1; j<=i;j++){
               int sum = i*j;
               System.out.print(i+"*"+j+"="+sum+"\t\t");
           }
            System.out.println();
        }
    }
}
