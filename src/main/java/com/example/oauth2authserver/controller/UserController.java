package com.example.oauth2authserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class UserController {
    @RequestMapping("user")
    @ResponseBody
    public Principal user(Principal principal) {
        return principal;
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "成功！";
    }

//    public static void main(String [] args) {
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("key1", "value");
//        map.put("key2", null);
//        map.put("key3", "");
//        for (Object object: map.values()) {
//            if (object == null || object.toString().length() == 0) System.out.println("false");
//        }
//    }
}
