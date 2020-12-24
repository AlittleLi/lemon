package com.lemon.class07.first;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author Liyuan
 * @Date 2020/7/9
 * @Version 2.0
 */
public class GuessTheWords {
    private static int num;


    public static void main(String[] args) {
         setWords(55);
    }

    public static void setWords(int num){
        System.out.println("猜字游戏开始：");
        while(true){
            System.out.println("请输入数字:");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if(a < num){
                System.out.println("您输入的数字偏小！");
            }else if(a>num){
                System.out.println("您输入的数字偏大！");
            }
            else{
                System.out.println("恭喜您答对了");
                break;
            }
        }
    }

}
