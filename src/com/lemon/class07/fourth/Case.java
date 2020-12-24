package com.lemon.class07.fourth;

import java.util.ArrayList;

public class Case {
    private int id;
    private String name;
    private int apild;

    public int getApild() {
        return apild;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Case(int id, String name, int apild){
        this.id = id;
        this.name =name;
        this.apild = apild;
    }

    public static void main(String[] args) {
        Case c1 = new Case(1,"c1",1);
        Case c2 = new Case(2,"c2",2);
        Case c3 = new Case(3,"c3",3);
        Case c4 = new Case(4,"c4",4);
        Case c5 = new Case(5,"c5",5);
        ArrayList <Case> list = new ArrayList<>();
        ArrayList<Case> wantList = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        for (Case c:list){
            if(c.getApild()==3){
                wantList.add(c);
                for (Case cc : wantList){
                    System.out.println("姓名是:"+cc.getName()+" id是:"+cc.getId()+" apiid是:"+cc.getApild());
                }
            }
        }
    }


}
