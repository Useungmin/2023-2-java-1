package com.green.day8.ch5;

public class Test_1 {
    public static void main(String[] args) {
        int[] score = {100, 88, 100, 100, 90};
    int  sum =0;
    float avg =0;
        for (int i = 0; i <score.length ; i++) {
            sum+=score[i];
            avg=(float)sum/score.length;

        }
        System.out.println(sum);
        System.out.println(avg);
    }
}
