package com.example.testapp.chap08.test;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

public class Test4 {
    public static void main(String[] args) {
        Member[] members = new Member[3];
        members[0] = Member.builder()
                        .name("안녕")
                        .age(12)
                        .build();
        members[1] = Member.builder()
                        .name("빵형")
                        .age(43)
                        .build();
        members[2] = Member.builder()
                        .name("수영")
                        .age(15)
                        .build();
        for (Member mem : members) {
            System.out.println(mem.toString());
        }
    }
}

@Data
@RequiredArgsConstructor
class Member {
    private String name;
    private int age;

    @Builder
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
