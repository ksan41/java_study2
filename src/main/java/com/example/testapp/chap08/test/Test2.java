package com.example.testapp.chap08.test;

import java.util.Scanner;
import lombok.Data;

public class Test2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] people = new Person[5];
        people[0] = new Person("지은", 29, "010-1234-1234");
        people[1] = new Person("수현", 24, "010-2344-1233");
        people[2] = new Person("지영", 31, "010-4542-1234");
        people[3] = new Person("지수", 22, "010-9812-4444");
        people[4] = new Person("산",29,"010-3333-4444");

        while (true) {
            System.out.println("검색할 이름 입력,0 입력시 종료");
            String input = sc.next();

            if (input.equals("0")) {
                System.out.println("프로그램 종료");
                break;
            }

            for (int i = 0; i < people.length; i++) {
                if (input.equals(people[i].getName())) {
                    System.out.println(people[i].toString());
                }
            }
        }
    }
}

@Data
class Person {
    private String name;
    private int age;
    private String phone;

    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    
}
