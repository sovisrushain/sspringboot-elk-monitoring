package com.cisco.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestApi {

    private static final Logger logger = LoggerFactory.getLogger(TestApi.class);

    @GetMapping("/am")
    public String morning() {
        logger.info("TestApi=>morning=>called");
        return "Good Morning!";
    }

    @GetMapping("/pm")
    public String night() {
        logger.info("TestApi=>night=>called");
        return "Good Night!";
    }


}
