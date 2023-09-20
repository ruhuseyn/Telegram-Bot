package com.example.damnedtgbot.repo;

import com.example.damnedtgbot.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuesitonRepo extends JpaRepository<Question,Long> {
}
