package com.lemon.class07.first;

import com.lemon.class5.Student;

/**
 * @Description TODO
 * @Author Liyuan
 * @Date 2020/7/9
 * @Version 2.0
 */
public class Student07 {
    String name;
    int age;
    int score;

    public Student07(){

    }

    public Student07(String name,int age,int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public static void main(String[] args) {
        Student07 student07 = new Student07();
        Student07 [] arrys = student07.getArray();
        student07.show(arrys);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
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

    public  Student07 [] getArray(){
        Student07 xiaoming = new Student07("xiaoming",17,45);
        Student07 xiaowang = new Student07("xiaowang",18,65);
        Student07 xiaozhang = new Student07("xiaozhang",15,100);
        Student07 xiaohuang = new Student07("xiaohuang",16,85);
        Student07 xiaoyang = new Student07("xiaoyang",19,90);
        Student07[] a = new Student07[5];
        a[0] = xiaoming;
        a[1] = xiaowang;
        a[2] = xiaozhang;
        a[3] = xiaohuang;
        a[4] = xiaoyang;
        return a;
    }

    public  void show(Student07[] arry){
        arry = getArray();
        for (int i = 0; i<arry.length;i++){

            String name = arry[i].getName();
            int age = arry[i].getAge();
            System.out.print("姓名:"+name+" 年龄: "+age);

            int score = arry[i].getScore();
            if (score <60){
                System.out.println(" 不及格分数为:"+score);
            }  else if(score>=60&&score<90){
                System.out.println(" 及格分数为:"+score);
            }else if(score>=90&&score<=100){
                System.out.println(" 优秀分数为:"+score);
            }else {
                System.out.println("分数错误");
            }
        }

    }
}
