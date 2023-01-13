package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    Logger logger = LoggerFactory.getLogger(SampleController.class);

    @GetMapping(path = "/hello-world", produces = "application/json")
    public ResponseModel helloWorld() {
        logger.info("This is a log message triggered when hitting this endpoint");
        return new ResponseModel("hello world!");

    }
}
