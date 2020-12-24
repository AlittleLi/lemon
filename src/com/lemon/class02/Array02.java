package com.lemon.class02;

/**
 * @Description TODO
 * @Author Liyuan
 * @Date 2020/6/20
 * @Version 2.0
 */
public class Array02 {
    public static void main (String [] args){
        /*
        * 静态创建二维数组
        * 数据类型[][] 数组名 = {{值1,值2},{值3,值4}}
        * */
        String [] [] arr1 = {{"java","html"}, {"css","javascript"}};
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++) {
                System.out.println("静态二维数组值:"+arr1[i][j]);
            }
        }
        /*
        * 动态创建二维数组
        * 数据类型[][] 数组名 = new 数据类型[][];
        * */
        String [][] arr2 = new String[2][2];
        arr2[0][0] = "java";
        arr2[0][1] = "html";
        arr2[1][0] = "css";
        arr2[1][1] = "javascript";
        for(int i =0; i < 2;i++){
            for(int j = 0; j < 2; j++){
                System.out.println("动态二维数组值:"+arr2[i][j]);
            }
        }
    }
}
