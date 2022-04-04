package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.service.CounterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    final Logger logger;

    public TestController() {
        this.logger = LoggerFactory.getLogger(TestController.class);
    }

    @GetMapping(value = "/test")
    ApiResponse get() {
        logger.info("/test get request");
        return ApiResponse.ok("succeed");
    }
}
