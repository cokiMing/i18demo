package com.cokiMing.controller;

import com.cokiMing.common.LocaleType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wuyiming on 2017/10/25.
 */
@RestController
public class TestController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String getMessage() {
        String message = LocaleType.getMessage("message.hi");
        System.out.println("get message: " + message);
        return message;
    }
}
