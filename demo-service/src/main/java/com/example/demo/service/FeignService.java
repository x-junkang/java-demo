package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

//此处name需要设置不为空，url需要在.properties中设置
@Service
@FeignClient(url = "localhost:8080", name = "service")
public interface FeignService {
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    @ResponseBody
    String getMessage(@RequestParam(name = "name") String name);
}