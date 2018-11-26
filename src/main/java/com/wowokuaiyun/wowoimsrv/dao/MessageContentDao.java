package com.wowokuaiyun.wowoimsrv.dao;

import com.wowokuaiyun.wowoimsrv.entity.MessageContent;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 消息内容Dao
 *
 * @author DingJie on 2018/11/26
 */
@Repository
@CacheConfig(cacheNames = "MessageContents")
public interface MessageContentDao extends JpaRepository<MessageContent, Integer> {

    /**
     * 通过MessageContentID  获取MessageContent
     *
     * @param id MessageContentID
     * @return MessageContent
     */
    @Cacheable(key = "'messageContents_'+#p0")
    MessageContent findMessageContentById(Integer id);
}
