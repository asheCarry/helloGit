package com.wael.swaggerdemo.web;

import com.wael.swaggerdemo.web.model.Member;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Api(tags = "hello 模块说明")
public class HelloController {
    @GetMapping("/hello")
    @ApiOperation("向某个人打招呼")
    public String hello(@ApiParam("打招呼的对象") String name){
        return "hello " + name;
    }

    @PostMapping("/save")
    @ApiOperation("提交用户信息")
    public Map save(String name,String second){
        HashMap model = new HashMap<>(4);
        model.put("first",name);
        model.put("second",second);
        model.put("status","OK");
        return model;
    }

    @PostMapping("/saveMember")
    @ApiOperation("提交用户信息")
    public Member save(Member member){
        return member.setStatus("ok");
    }
}
