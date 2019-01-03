package com.csh.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/helloWorld")
public class HelloWorld {

    @GetMapping
    public ResultVO hello(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(200);
        resultVO.setData("hello_world");
        resultVO.setMsg("成功");
        return resultVO;
    }
}
