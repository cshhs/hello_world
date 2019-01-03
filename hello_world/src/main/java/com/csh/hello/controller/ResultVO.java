package com.csh.hello.controller;

import lombok.Data;

@Data
public class ResultVO<T> {
    private String msg;
    private Integer code;
    private T data;
}
