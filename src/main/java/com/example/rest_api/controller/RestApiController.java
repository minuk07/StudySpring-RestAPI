package com.example.rest_api.controller;

import com.example.rest_api.model.BookQueryParam;
import org.springframework.web.bind.annotation.*;

@RestController//Rest API를 처리하는 controller
@RequestMapping("/api") //어떠한 주소를 받겠다 (주소중에 api로 시작하는 주소는 이쪽 컨트롤러로 요청을 받겠다.
public class RestApiController { //서버에 특정 데이터를 요청
    // "http:localhost:8080/api/hello
    // "/api/hello" -> hello() 매핑.
    @GetMapping(path = "/hello") //GET 메소드 사용, api로 시작하는 주소중에 hello 값을 요청하면 문자 리턴
    public String hello(){
        var html = "<html><body> <h1> Hello Spring Boot </h1></body></html>";
        return html; //응답은 문자열, 통신할 때는 문자열전달.
    }

    //"http://localhost:8080/api/echo/steave/age/20/is-man/true"
    @GetMapping(path = "/echo/{message}/age/{age}/is-man/{isMan}")
    public String echo(@PathVariable(name = "message") String msg, @PathVariable int age, @PathVariable boolean isMan){
        System.out.println("echo message : " + msg);
        System.out.println("echo age : " + age);
        System.out.println("echo isMan : " + isMan);

        msg = msg.toUpperCase();
        return msg;
    }

    //Query Parameter
    // http://localhost:8080/api/query-param?category=IT&issuedYear=2023&issued-month=01&issued_day=31
    @GetMapping(path = "/query-param")
    public void queryParam(
            @RequestParam String category,
            @RequestParam String issuedYear,
            @RequestParam(name = "issued-month") String issuedMonth, //issued-month는 불가능하기 때문에 name으로 지정.
            @RequestParam(name = "issued_day") String issuedDay
    ){
        System.out.println(category);
        System.out.println(issuedYear);
        System.out.println(issuedMonth);
        System.out.println(issuedDay);;
    }

    //객체를 통해 파싱
    // http://localhost:8080/api/book2?category=IT&issuedYear=2023&issuedMonth=01&issuedDay=31
    @GetMapping(path = "/book2")
    public void queryParamDTO(
            BookQueryParam bookQueryParam
    ){
        System.out.println(bookQueryParam);
    }

    //http:://localhost:8080/api/operator?a=3&b=4
    @GetMapping(path = "/operator")
    public void operator(@RequestParam int a, @RequestParam int b){
        System.out.println(a+b);
        System.out.println(a*b);
    }
}
