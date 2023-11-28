package com.example.testapp.java_bread.chap08;

public class Sample05 {

    public static int total = 0;

    public static void main(String[] args) {
        System.out.printf("결과 : %d\n", sum(1, 2, 3));
        System.out.printf("결과 : %d", sum("여러 인자를 가진 가변인자", 5 , 5, 10));
    }

    // 가변 인자.
    // 인자... 으로 표시, 해당 자료형의 인자가 가변적으로 들어온다는 것을 의미
    // 배열로 값을 받아오도록 함.
    public static int sum(int... a) {
        for (int i : a) {
            total += i;
        }
        return total;
    }

    // *주의*
    // 일반 인자와 같이 사용할 경우, 가변 인자가 맨 마지막에 들어가야 함.
    public static int sum(String str, int... b) {
        for (int i : b) {
            total += i;
        }
        System.out.println(str);
        return total;
    }

}
