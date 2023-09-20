package com.example.damnedtgbot.entity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.apache.commons.lang3.builder.ToStringExclude;

import java.util.List;

@Entity
@Table(name = "question_locale")
//@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class QuestionLocale {
    @Id
    Long id;

    @Column(name = "question")
    String text;

    @ManyToOne
    @JoinColumn(name = "language_id", referencedColumnName = "id")
    Language language;
    @ManyToOne
    @JoinColumn(name = "question_id", referencedColumnName = "id")
    Question question;

    @OneToMany(mappedBy = "questionLocale",fetch = FetchType.EAGER)
    List<Option>options;
}

