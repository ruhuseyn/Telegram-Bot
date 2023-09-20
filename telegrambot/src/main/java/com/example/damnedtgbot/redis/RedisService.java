package com.example.damnedtgbot.redis;

import com.example.damnedtgbot.entity.Option;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Service
@RequiredArgsConstructor
public class RedisService {
    private final RedisDataRepo redisDataRepo;

    public List<RedisEntity> getAll(){
        return  StreamSupport.stream(redisDataRepo.findAll().spliterator(), false)
                .collect(Collectors.toList());
//        return redisDataRepo.findAll();
    }
    public RedisEntity save(RedisEntity redisEntity){
        return redisDataRepo.save(redisEntity);
    }
    public Optional<RedisEntity> findByChatId(Long chatId){
        return  redisDataRepo.findById(chatId);
    }

    public RedisEntity remove(Long chatId){
        RedisEntity redisEntity = findByChatId(chatId).get();
        redisDataRepo.delete(redisEntity);
        return redisEntity;
    }

    public void clearCache(){
        redisDataRepo.deleteAll();
    }


//    @Cacheable(cacheNames = "mySpecialCache")
//    public String longRunningMethod(){
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        return "Long Method";
//    }
//    @CacheEvict(cacheNames = "product")
//    public void clearCache(){
//        System.out.println("cache was cleaned");
//    }

//    @CachePut(value = "students", key = "#id")
}
