package com.lemon.class5;

/**
 * @Description TODO
 * @Author Liyuan
 * @Date 2020/7/5
 * @Version 2.0
 */
public class FunctionDemo3 {

    public static void main(String[] args) {


        int[] classA = {65,40,66,80,90,100,45,59};
        int[] classB = {60,40,68,80,95,38,45,59};
        int[] classC = {60,30,68,58,93,28,45,59};

        System.out.println("classA及格人数为："+getData(classA,60));
        System.out.println("classB及格人数为："+getData(classB,60));
        System.out.println("classC及格人数为："+getData(classC,60));


    }


    private static int getData(int[] data,int target){
        int sum = 0;
        if(data != null){
            for (int value : data) {
                if(value >= target){
                    sum+=1;
                }
            }
            return sum;
        }
        return 0;

    }

}
