package com.lemon.class07.second;

/**
 * @Description TODO
 * @Author Liyuan
 * @Date 2020/7/9
 * @Version 2.0
 */
public class Teacher extends Person {

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.play();
        t.name ="王";
//        无法调用私有属性，私有方法
//        t.study;
//        t.sex ="女";
        System.out.println("多态方式调用：");
        //多肽
        Person teacher =new Teacher();
        teacher.play();
    }

    @Override
    public void play(){
        System.out.println("老师再玩");
    }
}
