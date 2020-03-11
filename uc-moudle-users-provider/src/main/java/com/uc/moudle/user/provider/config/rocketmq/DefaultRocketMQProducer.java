package com.uc.moudle.user.provider.config.rocketmq;import org.apache.rocketmq.client.exception.MQClientException;import org.apache.rocketmq.client.producer.DefaultMQProducer;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.beans.factory.annotation.Value;import org.springframework.context.annotation.Bean;import org.springframework.stereotype.Component;/** * @author 9527 * @ClassName DefaultRocketMQProducer * @Date 2020/1/21 * @Description TODO * @Version 1.0 */@Componentpublic class DefaultRocketMQProducer {    private Logger logger = LoggerFactory.getLogger(DefaultRocketMQProducer.class);    @Value("${user.rocketmq.groupName}")    private String groupName;    @Value("${user.rocketmq.namesrvAddr}")    private String nameserAddr;    @Value("${user.rocketmq.instanceName}")    private String instanceName;    @Value("${user.rocketmq.maxMessageSize}")    private int maxMessageSize;    @Value("${user.rocketmq.sendMsgTimeout}")    private int sendMsgTimeout;    private DefaultMQProducer producer;    @Bean    public DefaultMQProducer getRocketMQProducer() {        producer = new DefaultMQProducer(groupName);        producer.setNamesrvAddr(nameserAddr);        producer.setInstanceName(instanceName);        producer.setMaxMessageSize(maxMessageSize);        producer.setSendMsgTimeout(sendMsgTimeout);        producer.setVipChannelEnabled(false);        try {            producer.start();            logger.info("rocketMQ is start !!groupName : {},nameserAddr:{}",groupName,nameserAddr);        } catch (MQClientException e) {            logger.error(String.format("rocketMQ start error,{}",e.getMessage()));            e.printStackTrace();        }        return producer;    }}