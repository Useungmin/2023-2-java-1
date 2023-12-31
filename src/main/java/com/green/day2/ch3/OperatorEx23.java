package com.green.day2.ch3;

public class OperatorEx23 {
    public static void main(String[] args) {
        String s1 = "Hello", s2 = "Hello";
        String s3 = new String("Hello");

        System.out.printf("%s == %s : %b\n", s1, s2, s1 == s2); //객체비교, 동일성비교==
        System.out.printf("%s == %s : %b\n", s1, s3, s1 == s3);
        System.out.printf("%s.equals(%s) : %b\n", s1, s3, s1.equals(s3)); // 문자열  비교는 equals 사용, 동등성비교
        System.out.printf("%s.equals(%s) : %b\n", s3, s1, s3.equals(s1)); // java에서 문자열 비교는 equals메소드를 이용해야한다. [중요함]
        //reference type에서 == 비교는 주소값 비교
    }
}
