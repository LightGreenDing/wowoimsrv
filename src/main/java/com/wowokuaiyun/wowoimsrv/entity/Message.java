package com.wowokuaiyun.wowoimsrv.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * 消息
 *
 * @author DingJie on 2018/11/26
 */
@Entity
@Getter
@Setter
@Table(name = "wo_message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="int(11) COMMENT '编号'")
    private int id;
    @Column(name = "send_id",columnDefinition="int(11) COMMENT '发送者ID'")
    private int sendId;
    @Column(name = "recl_id",columnDefinition="int(11) COMMENT '接受者ID'")
    private int reclId;
    @Column(name = "message_id",columnDefinition="int(11) COMMENT '消息ID'")
    private int messageId;
    @Column(name = "statue",columnDefinition="bit(1) COMMENT '状态(0:未读 1:已读 -1:删除)'")
    private byte statue;
}
