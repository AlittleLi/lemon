package com.lemon.class07.first;

/**
 * @Description TODO
 * @Author Liyuan
 * @Date 2020/7/9
 * @Version 2.0
 */
public class Judgment {
    public static void main(String[] args) {
        int [] arry1= {55,44,33,22,11};
        int [] arry2 = {32,55,66,88,44};
        for (int i = 0 ;i<arry1.length;i++){
            for(int j = 0; j<arry2.length;j++){
                if (arry1[i] == arry2[j]) {
                    System.out.println(arry1[i]);
                }
            }
        }
    }


}
