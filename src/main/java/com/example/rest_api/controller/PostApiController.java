package com.example.rest_api.controller;

import com.example.rest_api.model.BookRequest;
import com.example.rest_api.model.User;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostApiController {

    //post는 디폴트로 객체로 받아야함.
    //"http://localhost:8080/api/post"
    @PostMapping("/post")
    public String post(@RequestBody BookRequest bookRequest){//post나 put방식에서 HTTP Body로 들어오는 데이터를 객체에다가 데이터 클래스에 매핑.
        System.out.println(bookRequest);
        return bookRequest.toString();
    }

    @PostMapping("/post2")
    public User post2(@RequestBody User user){
        System.out.println(user);
        return user;
    }
}


