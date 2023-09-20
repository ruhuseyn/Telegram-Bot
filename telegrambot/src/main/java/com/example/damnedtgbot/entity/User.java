package com.example.damnedtgbot.entity;


import lombok.*;
import lombok.experimental.FieldDefaults;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @Id
    long id;
    @Column(name = "chat_id")
    long chatId;
    @Column(name = "telegram_id")
    long telegramId;
    @Column(name = "phone_number")
    String phoneNumber;
    @Column(name = "full_name")
    String fullName;
    @OneToMany(mappedBy = "user")
    List<Session> sessions;
}
