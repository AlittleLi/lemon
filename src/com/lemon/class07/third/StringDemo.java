package com.lemon.class07.third;

public class StringDemo {
    public static void main (String args[]){
        String s = "abc,123,中国,||||||,haha";
        String s1 = s.substring(0,3);
        String s2 = s.substring(4,7);
        String s3 = s.substring(8,10);
        String s4 = s.substring(11,17);
        String s5 = s.substring(18,22);
        System.out.print(s1+":"+s1.length()+",");
        System.out.print(s2+":"+s2.length()+",");
        System.out.print(s3+":"+s3.length()+",");
        System.out.print(s4+":"+s4.length()+",");
        System.out.println(s5+":"+s5.length());

        String a = "aiwozhonghua";
        String b = new StringBuffer(a).reverse().toString();
        System.out.println("反转前:"+a);
        System.out.println("反转后:"+b);
    }

}
