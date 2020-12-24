package com.example.demo.controller;

import com.example.demo.dto.HelloDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @ClassName IndexController
 * @Description //TODO
 * @Author ccy
 * @Date 2020/12/24 10:04
 * @Version 1.0
 **/
@RestController
@RequestMapping("/index")
public class IndexController {
    @PostMapping("/index")
    public String index(@Valid @RequestBody HelloDto dto){
        return dto.toString();
    }
}
