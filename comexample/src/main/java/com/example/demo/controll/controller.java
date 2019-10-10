package com.example.demo.controll;

import com.fasterxml.jackson.databind.JsonSerializable;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@RestController
public class controller {
    @RequestMapping("/menu/list")
    @GetMapping
    public int index(){
        System.out.println("d");
//        对象序列化
        return 1;
    }
}
