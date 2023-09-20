package com.example.damnedtgbot.repo;

import com.example.damnedtgbot.entity.QuestionLocale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionLocaleRepo extends JpaRepository<QuestionLocale, Long> {
    @Query("SELECT q FROM QuestionLocale q " +
            "WHERE q.language.id = ?1")
    List<QuestionLocale> findAllByLanguage_Id(long langId);

    @Query("select q from QuestionLocale q where q.id=1")
     QuestionLocale getFirstQuestion();

    QuestionLocale findByLanguageIdAndAndQuestionId(long langId, long questionId);
}
