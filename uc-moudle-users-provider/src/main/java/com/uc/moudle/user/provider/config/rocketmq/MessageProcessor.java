package com.uc.moudle.user.provider.config.rocketmq;import org.apache.rocketmq.common.message.MessageExt;public interface MessageProcessor {    boolean handle(MessageExt messageExt);}