package com.example.demo.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @ClassName HelloDto
 * @Description //TODO
 * @Author ccy
 * @Date 2020/12/24 10:05
 * @Version 1.0
 **/
@Data
public class HelloDto {
    @NotBlank(message = "名称不能为空")
    private String name;//
    @NotBlank(message = "城市不能为空")
    private String city;//
}
