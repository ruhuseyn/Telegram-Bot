package com.example.damnedtgbot.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Entity
@Table(name = "language")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Language {

    @Id
    int id;

    @Column
    String name;

    @OneToMany(mappedBy = "language",fetch = FetchType.EAGER)
    List<QuestionLocale> textQuses;
}


