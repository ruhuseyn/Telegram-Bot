package com.example.damnedtgbot.controller;

import com.example.damnedtgbot.redis.RedisEntity;
import com.example.damnedtgbot.redis.RedisService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/redis")
@RequiredArgsConstructor
public class RedisController {
//    @Autowired
    private final RedisService redisService;

    @GetMapping
    public List<RedisEntity> getAll(){
        return redisService.getAll();
    }

    @GetMapping("/{chatId}")
    public RedisEntity getByChatId(@PathVariable Long chatId){
        return redisService.findByChatId(chatId).get();
    }

    @DeleteMapping
    public String deleteAll(){
        redisService.clearCache();
        return "Cache cleared";
    }
}
