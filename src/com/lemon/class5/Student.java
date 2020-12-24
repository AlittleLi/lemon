package com.lemon.class5;

/**
 * @Description TODO
 * @Author Liyuan
 * @Date 2020/7/4
 * @Version 2.0
 */
public class Student {
    private String name;
    private int age;
    private int fraction;
    public Student(){

    }
    public Student(String name,int age, int fraction) {
        this.name = name;
        if(age < 15){
            System.out.println("设置年龄小于15岁，重置为15岁");
            this.age = 15;
        }else{
            this.age = age;
        }
        this.fraction = fraction;

    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age < 15){
            System.out.println("设置年龄小于15岁，重置为15岁");
            this.age = 15;
        }else{
            this.age = age;
        }
    }

    public int getFraction() {
        return fraction;
    }

    public static void main(String[] args) {
        Student zhangsan = new Student();
        Student  xiaoming= new Student("小明",12,100);
        System.out.println("小明年龄为："+xiaoming.getAge());
        System.out.println("重新设置年龄为14");
        xiaoming.setAge(14);
        System.out.println("获取重置年龄为："+xiaoming.getAge());
        System.out.println("修改年龄为18");
        xiaoming.setAge(18);
        System.out.println("修改姓名为小红");
        xiaoming.setName("小红");
        String name = xiaoming.getName();
        int age = xiaoming.getAge();
        int fraction = xiaoming.getFraction();
        System.out.println("姓名为："+name+" 年龄为："+age+" 分数为："+fraction);


    }

}
