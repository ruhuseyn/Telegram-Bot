package com.example.damnedtgbot.entity;

import lombok.Builder;
import lombok.Data;

import java.util.HashMap;
import java.util.List;

@Data
@Builder
public class SessionTemp {
    Long chatId;
    Lang lang;
    Long currentQuestion;
    List< String> answers;
}
