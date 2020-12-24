package com.lemon.class08.one;

import com.lemon.class08.two.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * @Description TODO
 * @Author Liyuan
 * @Date 2020/7/16
 * @Version 2.0
 */
public class HashMapDemo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        HashMap<String,String> map = new HashMap<>();
        map.put("id","1");
        map.put("mobile_phone","13212312312");
        map.put("pwd","12312312");


        System.out.println("需求a结果：");
        for (String k : map.keySet()){
            String value = map.get(k);
            System.out.println("值为："+value);
        }
        System.out.println("===========");
        for(HashMap.Entry<String,String> entry : map.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(value);
            if(key.equals("mobile_phone")){
                list.add(value);
            }
        }

        System.out.println("需求b结果：");
        if(list.size()>0){
            for (int i =0;i<list.size();i++){
                String a = list.get(0);
                System.out.println("mobile_phone值为："+a);
            }

        }else {
            System.out.println("没有获取到mobile_phone键");
        }
        System.out.println("需求c结果：");
        map.replace("pwd","12312312","88888888");
        System.out.println("pwd中替换后的值为："+map.get("pwd"));
    }
}
