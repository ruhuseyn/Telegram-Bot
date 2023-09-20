package com.example.damnedtgbot.entity;

import lombok.Getter;

@Getter
public enum Lang {
    AZ(1),
    EN(3),
    RU(2);
    private int id;

    Lang(int id) {
        this.id = id;
    }
}
