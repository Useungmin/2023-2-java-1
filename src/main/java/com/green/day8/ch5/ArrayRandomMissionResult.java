package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayRandomMissionResult {

    // 1. 5개 방 배열만들고 // 2. 랜덤숫자생성 // 3. 랜덤숫자를 5개의 각방에다가 기입
    public static void main(String[] args) {

        int[]arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr [i] =(int)(Math.random()*10)+1;
           // int nem =(int)(Math.random()*10)+1;
           // arr[i] =nem;
            //System.out.printf("array[%d]:%d\n",i,arr);

            for (int j = 0; j <i ; j++) {
                if(arr[i]==arr[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
