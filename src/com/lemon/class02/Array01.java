package com.lemon.class02;


import com.lemon.class5.Student;

/**
 * @Description TODO
 * @Author Liyuan
 * @Date 2020/6/20
 * @Version 2.0
 */
public class Array01 {
    public static void main(String[] args){


        Student student = new Student();
        student.setAge(15);

        System.out.println(student.getAge());



    }

//        /*
//        *动态创建一维数组
//        * 数据类型[] 数组名 = new 数据类型[数组长度];
//        * */
//        int[] a1 = new int[5];
//        int b = 100;
//        for(int i = 0; i<a1.length; i++){
//            int d = i*100;
//            a1[i] = b+d;
//            System.out.println("动态数组值:"+a1[i]);
//        }
//        /*
//        * 静态创建一维数组
//        * 数据类型[] 数组名 =  {值1，值2，值3};
//        * */
//        int[] a2 = {100,200,300,400,500};
//        for (int i = 0;i<a2.length;i++) {
//            System.out.println("静态数组值:" + a2[i]);
//        }
//    }
}
