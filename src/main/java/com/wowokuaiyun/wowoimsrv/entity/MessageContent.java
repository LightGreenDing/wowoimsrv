package com.wowokuaiyun.wowoimsrv.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * 消息内容
 *
 * @author DingJie on 2018/11/26
 */
@Entity
@Getter
@Setter
@Table(name = "wo_message_content")
public class MessageContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "int(11) COMMENT '编号'")
    private int id;
    @Column(name = "content", columnDefinition = "varchar(100) COMMENT '内容'")
    private int content;
    @Column(name = "time", columnDefinition = "datetime COMMENT '发送时间'")
    private int time;
}
