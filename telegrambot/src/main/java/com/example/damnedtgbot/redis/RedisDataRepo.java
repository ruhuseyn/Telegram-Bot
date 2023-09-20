package com.example.damnedtgbot.redis;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RedisDataRepo extends CrudRepository<RedisEntity,Long> {

}
