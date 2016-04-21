package com.atlsmall.controller;

import com.atlsmall.common.resp.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by haonan on 16/4/21.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {
    @RequestMapping("/hello")
    @ResponseBody
    public Result getAccommodationPeriodicalPrice() {
        return Result.success();
    }
}
