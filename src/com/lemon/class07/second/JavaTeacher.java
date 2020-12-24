package com.lemon.class07.second;

/**
 * @Description TODO
 * @Author Liyuan
 * @Date 2020/7/11
 * @Version 2.0
 */
public class JavaTeacher extends Teacher {

    public static void main (String args[]){
        JavaTeacher javaTeacher = new JavaTeacher();
        javaTeacher.name = "javateacher";
        javaTeacher.play();
//        无法调用私有属性，私有方法
//        javaTeacher.sex;
//        javaTeacher.study;

    }
}
