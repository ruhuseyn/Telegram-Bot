package com.example.damnedtgbot.entity;



import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;

@Entity
@Table(name = "userdata")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserData {

    @Id
    Long id;

    @Column
    String name;

    @Column
    String surname;

    @Column
    String username;

    @Column
    Timestamp registeredAt;
}
