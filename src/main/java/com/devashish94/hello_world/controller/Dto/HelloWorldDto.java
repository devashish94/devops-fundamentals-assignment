package com.devashish94.hello_world.controller.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HelloWorldDto {

    private String status;

    private Integer statusCode;

    private String message;

}
