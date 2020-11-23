package com.wael.swaggerdemo.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "点赞模块")
public class GoodController {
    @ApiOperation("点赞某人or某事")
    @PutMapping("like")
    public String likeSth(@ApiParam(name = "any", value = "点赞的对象") String any) {
        return "ok";
    }

    @ApiOperation("取消点赞")

    @DeleteMapping("unlike")
    public String unlikeSth(@ApiParam(name = "any", value = "点赞的对象") String any) {
        return "ok";
    }
}
