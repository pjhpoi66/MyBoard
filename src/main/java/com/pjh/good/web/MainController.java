package com.pjh.good.web;

import org.springframework.web.bind.annotation.*;

import com.pjh.good.web.dto.HelloResponseDto;

@RestController
public class MainController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("age") int age) {

        return new HelloResponseDto(name, age);
    }
}
