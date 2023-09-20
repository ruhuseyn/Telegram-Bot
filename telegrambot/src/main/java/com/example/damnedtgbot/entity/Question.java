package com.example.damnedtgbot.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "question")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Question {

    @Id
    Long id;

    @Column
    String type;

    @Column
    LocalDateTime atDelete;
//    @JsonIgnore
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "next_question_id", referencedColumnName = "id")
    @Column(name = "next_question_id")
    Long nextQuestion;

    @OneToMany(mappedBy = "question", fetch = FetchType.EAGER)
    List<QuestionLocale> textQues;
}
