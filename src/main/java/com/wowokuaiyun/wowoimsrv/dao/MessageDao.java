package com.wowokuaiyun.wowoimsrv.dao;

import com.wowokuaiyun.wowoimsrv.entity.Message;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 消息Dao
 *
 * @author DingJie on 2018/11/26
 */
@Repository
@CacheConfig(cacheNames = "messages")
public interface MessageDao extends JpaRepository<Message, Integer> {

    /**
     * 通过MessageId 获取Message
     *
     * @param id MessageId
     * @return Message
     */
    @Cacheable(key = "'messages_'+#p0")
    Message findMessageById(Integer id);
}
