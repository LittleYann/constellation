package com.yann.constellation.service;

/**
 * Created by Yann on 2017/3/31.
 */
public class DemoService {

    public String login(String name, String pass) {
        if(name.equals("admin") && pass.equals("admin")) {
            return "success";
        }
        return "error";
    }
}
