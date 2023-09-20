package com.example.damnedtgbot.repo;

import com.example.damnedtgbot.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepo extends JpaRepository<UserData, Long> {
}
