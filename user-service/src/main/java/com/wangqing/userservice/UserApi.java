package com.wangqing.userservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserApi {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/create")
    public String create(){
        return new String(serverPort);
    }



}
