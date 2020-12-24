package com.lemon.class07.fourth;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main (String args[]){
        Teacher01 t1 = new Teacher01();
        Teacher01 t2 = new Teacher01();
        Teacher01 t3 = new Teacher01();
        Teacher01 t4 = new Teacher01();

        t1.setName("张三");t1.setAge(25);
        t2.setName("李四");t2.setAge(35);
        t3.setName("老王");t3.setAge(19);
        t4.setName("赵六");t4.setAge(29);
        ArrayList<Teacher01> list = new ArrayList<>();
        list.add(t1); list.add(t2); list.add(t3); list.add(t4);
        for (Teacher01 t : list){
            System.out.println("姓名是;"+t.getName()+" 年龄是:"+t.getAge());
        }
        System.out.println("=========================");
        list.remove(2);
        list.get(0).setName("张龙");
        for (Teacher01 t :list){
            System.out.println("姓名是;"+t.getName()+" 年龄是:"+t.getAge());
        }
    }
}
