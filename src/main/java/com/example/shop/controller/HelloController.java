package com.example.shop.controller;

import com.example.shop.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public UserDto hello() {
        UserDto userDto = new UserDto(10, "김길동");
        userDto.setAge(20);
        userDto.setName("홍길동");
        System.out.println("userDto : " + userDto);
        return userDto;
    }
}
