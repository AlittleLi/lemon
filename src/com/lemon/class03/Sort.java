package com.lemon.class03;


public class Sort {
    public static void main(String[] args) {
        int[] arrs = {4,1,3,2,5};
        for (int i = 0;i<arrs.length;i++){
            for (int j = 0 ; j<arrs.length-1;j++){
                if(arrs[j]>arrs[j+1]){
                    int value = arrs[j];
                    arrs[j] = arrs[j+1];
                    arrs[j+1] = value;
                }

            }
            System.out.print(arrs[i]+" ");
        }
    }

}
