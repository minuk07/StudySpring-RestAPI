package com.example.rest_api.controller;

import com.example.rest_api.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put")
    public void put(
            @RequestBody User userRequest
    ){
      log.info("Request : {}", userRequest);
      //sout은 속도가 저하될 수 있음. log는 버퍼에 저장
    }
}
