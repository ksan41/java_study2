package com.example.testapp.java_bread.chap08;

public class Sample17 {
    
    public static void main(String[] args) {
        Student st = new Student("빵형", 21, 1);
        System.out.println(st.toString());
    }
}

class Student {
    String name;
    int age;
    int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + name + "'" +
            ", age='" + age + "'" +
            ", grade='" + grade + "'" +
            "}";
    }

}
