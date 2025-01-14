package com.example.rest_api.controller;

import com.example.rest_api.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController //rest api로 동작. 응답을 Json으로 하겠다.
@RequestMapping("/api/v1")
public class ResponseApiController {

    //"http://localhost:8080/api/v1
    @GetMapping("") //디폴트 매핑
    public ResponseEntity<User> user(){
        var user = new User();
        user.setUserName("Hong");
        user.setUserAge(19);
        user.setUserEmail("hong@email.com");

        log.info("User: {}", user);

        var response = ResponseEntity //원하는 형태의 에러나 헤더를 지정할 수 있음.
                .status(HttpStatus.OK) //status cpde 지정
                .header("x-custom", "hi") //header custom
                .body(user); //body custom

        return response;
    }
}
