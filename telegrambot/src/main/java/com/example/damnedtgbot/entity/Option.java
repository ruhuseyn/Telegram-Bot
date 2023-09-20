package com.example.damnedtgbot.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "option")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Option {
    @Id
    long id;

    @Column(name = "name")
    String answer;
    @Column(name = "lang_id")
    Long langId;

    @ManyToOne
    @JoinColumn(name = "question_locale_id", referencedColumnName = "id")
    QuestionLocale questionLocale;
}
