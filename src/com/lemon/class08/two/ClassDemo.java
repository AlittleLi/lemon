package com.lemon.class08.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Description TODO
 * @Author Liyuan
 * @Date 2020/7/17
 * @Version 2.0
 */
public class ClassDemo {
    public static void main(String[] args) {
        HashMap<String,List<Student>> map = new HashMap<>();

        Student studentA = new Student("张三",25,"男");
        Student studentB = new Student("李四",26,"男");
        Student studentC = new Student("小花",27,"女");
        Student studentD = new Student("小明",28,"男");
        Student studentE = new Student("小红",29,"女");

        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();

        list1.add(studentA);
        list1.add(studentB);
        list1.add(studentC);
        list2.add(studentD);
        list2.add(studentE);

        map.put("1801",list1);
        map.put("1802",list2);
        System.out.println("第一种遍历方式：——————————————————————————");
        for (String a : map.keySet()){
            if(a.equals("1801")){
                System.out.println("1801班级学生信息为：");
                List<Student> class1 = map.get(a);
                for (Student student :class1){
                    String name = student.getName();
                    int age = student.getAge();

                    String sex = student.getSex();
                    System.out.println("姓名:"+name+" 年龄:"+age+" 性别:"+sex);
                }
            } else if(a.equals("1802")){
                System.out.println("1802班级学生信息为：");
                List<Student> class1 = map.get(a);
                for (Student student :class1){
                    String name = student.getName();
                    int age = student.getAge();
                    String sex = student.getSex();
                    System.out.println("姓名:"+name+" 年龄:"+age+" 性别:"+sex);
                }
            }
        }
        System.out.println("第二种遍历方式：——————————————————");
        for (HashMap.Entry<String,List<Student>> entry:map.entrySet()){

            if(entry.getKey().equals("1801")){
                System.out.println("1801班级学生信息为：");
                List<Student> class1 = entry.getValue();
                for (Student student :class1){
                    String name = student.getName();
                    int age = student.getAge();

                    String sex = student.getSex();
                    System.out.println("姓名:"+name+" 年龄:"+age+" 性别:"+sex);
                }
            } else if(entry.getKey().equals("1802")){
                System.out.println("1802班级学生信息为：");
                List<Student> class1 = entry.getValue();
                for (Student student :class1){
                    String name = student.getName();
                    int age = student.getAge();
                    String sex = student.getSex();
                    System.out.println("姓名:"+name+" 年龄:"+age+" 性别:"+sex);
                }
            }
        }
    }

}
