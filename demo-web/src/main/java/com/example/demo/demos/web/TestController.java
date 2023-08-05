package com.example.demo.demos.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @GetMapping("/testThread")
    public String testThread(Integer num) {
        try {
            log.info("testThread" + Thread.currentThread().getName() + " num:" + num);
            Thread.sleep(500);
            return "testThread";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }
}
