package com.green.day5.ch4;

public class FlowEx18Mission {
    public static void main(String[] args) {
        for (int i=1; i<=9; i++) {
            for (int j=2; j<=9; j++) {
                System.out.printf("%d X %d = %d\t", j, i, i * j);
            }
            System.out.println(); //안쪽for문이 끝난 시점 개행
        }
    }
}