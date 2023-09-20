package com.example.damnedtgbot.services.abstracts;

import lombok.NonNull;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public interface MessageService {
    SendMessage sendFirstMessage(long chatId);
    @NonNull String sendLanguageSelector(long chatId);

}
