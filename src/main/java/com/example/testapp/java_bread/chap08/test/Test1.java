package com.example.testapp.java_bread.chap08.test;

import java.util.Scanner;

public class Test1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("100이하의 정수 입력");
            int num = sc.nextInt();
            int sumValue = 0;

            if (num == 0) {
                System.out.println("프로그램 종료");
                break;
            }
            if (num > 100) {
                System.out.println("입력 값이 100보다 큽니다.");
            } else {
                System.out.println("결과 : " + sum(num, sumValue));
            }
        }
    }

    public static int sum(int num, int sumValue) {
        if (num > 0) {
            sumValue += num;
            return sum(num - 1, sumValue);
        } else {
            return sumValue;
        }
    }
}
