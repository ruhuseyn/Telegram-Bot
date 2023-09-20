package com.example.damnedtgbot.repo;

import com.example.damnedtgbot.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepo extends JpaRepository<Session,Long> {
}
