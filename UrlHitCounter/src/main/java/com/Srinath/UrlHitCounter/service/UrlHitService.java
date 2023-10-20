package com.Srinath.UrlHitCounter.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class UrlHitService {
    private static int hitCount = 0;

    public int getHitCount() {
        hitCount++;
        return hitCount;
    }
    public Map<String,Object> getHitCount(String username){
        getHitCount();
        Map<String, Object> response = new HashMap<>();
        response.put("userName", username);
        response.put("hitCount", hitCount);
        return response;
    }
}
