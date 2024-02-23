package com.login.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello(){
        return "안녕하세요. 로그인 하시겠습니까?\n";
    }
}
