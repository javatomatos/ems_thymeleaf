package com.beefcake.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String toIndex() {
        return "ems/login";
    }

    @RequestMapping("/toRegister")
    public String toRegister() {
        return "ems/regist";
    }

    @RequestMapping("/toSave")
    public String toSave() {
        return "ems/addEmp";
    }
}
