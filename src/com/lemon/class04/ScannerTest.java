package com.lemon.class04;

import java.util.Scanner;

public class ScannerTest {

    public int getSum(String symbol ,int a,int b){
        int sum = 0 ;
        if (symbol.equals("+")){
            sum = a + b;
            System.out.println("和为："+sum);
        }else if(symbol.equals("-")){
            sum = a - b;
            System.out.println("差为："+sum);
        }else if(symbol.equals("*")){
            sum = a * b;
            System.out.println("积为："+sum);
        }else if(symbol.equals("/")){
            sum = a / b;
            System.out.println("商a为："+sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            ScannerTest test = new ScannerTest();
            System.out.println("请输入运算符号：");
            String sym = sc.nextLine();
            if(!sym.equals("close")){
                System.out.println("请输入第一个值：");
                int a = sc.nextInt();
                System.out.println("请输入第二个值：");
                int b = sc.nextInt();
                test.getSum(sym, a, b);
            }else {
                System.out.println("程序退出");
                break;
            }
        }
    }
}
