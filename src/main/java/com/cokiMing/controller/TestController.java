package com.cokiMing.controller;

import com.cokiMing.common.LocaleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wuyiming on 2017/10/25.
 */
@RestController
public class TestController {

    @Autowired
    private LocaleType localeType;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String getMessage() {
        String message = localeType.getMessage("message.hi");
        System.out.println(message);
        return message;
    }
}
