package com.example.damnedtgbot.redis;

import com.example.damnedtgbot.entity.Lang;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder()
@AllArgsConstructor
@NoArgsConstructor
@RedisHash(value = "redisEntity")
public class RedisEntity implements Serializable {

    @Id
    private Long chatId;
    private Lang lang;
    private Long currentQuestion;
    private HashMap<String ,String> answers = new HashMap<>();
    private boolean isActive;
}
