package com.lemon.class08.two;

/**
 * @Description TODO
 * @Author Liyuan
 * @Date 2020/7/17
 * @Version 2.0
 */
public class Student {
    private String name;
    private int age;
    private String sex;

    public Student(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex= sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }



}
