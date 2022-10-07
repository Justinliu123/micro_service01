package com.liupanlong.task01.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
/*import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;*/
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

/**
 * 消费者
 * kafka监听器
 */
public class MyKafkaConsumer {


    /**
     * kafka的监听器1，topic为"topic_test"，消费者组为"group_topic_test"
     * @param record
     * @param item
     */
    @KafkaListener(topics = "topic_test", groupId = "group_topic_test")
    public void topicListener1(ConsumerRecord<String, String> record, Acknowledgment item) {
        String value = record.value();
        System.out.println(value);
        System.out.println(record);
        //手动提交
        item.acknowledge();
    }

    /**
     * 配置多个消费组
     * kafka的监听器2，topic为"topic_test2"，消费者组为"group_topic_test"
     * @param record
     * @param item
     */
    @KafkaListener(topics = "topic_test2", groupId = "console-consumer-61779")
    public void topicListener2(ConsumerRecord<String, String> record, Acknowledgment item) {
        String value = record.value();
        System.out.println(value);
        System.out.println(record);
        item.acknowledge();
    }
}