package com.green.day4.ch4;

public class Switch {
    public static void main(String[] args) {
        int val = 10; //break를 만날때까지 실행.

        switch(val) { //val에는 변수값. 1인경우, 2인경우, 3인경우, 디폴트는 3개다 아닌 경우.
            case 1:
                System.out.println("1이다");
                break;
            case 2:
                System.out.println("2이다");
                break;
            case 3:
                System.out.println("3이다");
                break;
            default:
                System.out.println("1~3이 아니다");
                break;
        }
        System.out.println("끝");
    }
}
