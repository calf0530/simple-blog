package com.example.blog.controller;

import com.example.blog.vo.Member;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BlogController {
    @RequestMapping(value="/sayHello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello, Yunjoo.";
    }

    @RequestMapping(value="/getInfo", method = RequestMethod.GET)
    public Member getInfo() {
        Member member = new Member(1,"Yunjoo, Song","calf0530@naver.com");
        return member;
    }

    @RequestMapping(value="/list", method = RequestMethod.GET)
    public List<Member> list() {
        List<Member> memberList = Arrays.asList(new Member[]{new Member(1,"Yunjoo, Song","calf0530@naver.com"),
                                                    new Member(2,"Yunjoo, Kim","calf0530@nate.com"),
                                                    new Member(3,"Yunjoo, Park","calf0530@google.com"),
                                                    new Member(4,"Yunjoo, Lee","calf0530@hanmail.net"),
                                                    new Member(5,"Yunjoo, Choi","calf0530@paran.com")});

        // test
        long startTime = System.currentTimeMillis();
        for (Member member : memberList) {
            System.out.println(member);
        }
        System.out.println((System.currentTimeMillis() - startTime) + " ms ");

        startTime = System.currentTimeMillis();
        memberList.forEach(System.out::println);
        System.out.println((System.currentTimeMillis() - startTime) + " ms ");
        //test

        return memberList;
    }
}
