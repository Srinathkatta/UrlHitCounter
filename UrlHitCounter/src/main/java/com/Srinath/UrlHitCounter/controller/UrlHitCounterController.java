package com.Srinath.UrlHitCounter.controller;


import com.Srinath.UrlHitCounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitCounterController {
    @Autowired
    private UrlHitService urlHitService;

    @GetMapping("count")
    public Integer getHitCount() {
        return  urlHitService.getHitCount();
    }

    @GetMapping("username/{username}/count")
    public Map<String, Object> getHitCount(@PathVariable String username) {
        return urlHitService.getHitCount(username);
    }
}
