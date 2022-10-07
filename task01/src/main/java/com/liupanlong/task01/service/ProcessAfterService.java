package com.liupanlong.task01.service;

import com.alibaba.fastjson.JSONObject;
import com.liupanlong.task01.constant.KafkaConstants;
import com.liupanlong.task01.dao.ProcessAfter;
import com.liupanlong.task01.dao.ProcessBefore;
import com.liupanlong.task01.service.client.Task02Client;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.Collections;

@Slf4j
@Service
public class ProcessAfterService {

    @Autowired
    private Task02Client task02Client;

    @Autowired
    private ProcessAfterRepository processAfterRepository;

    @KafkaListener(topics = "topic_test")
    public void topicListener(ConsumerRecord<String, String> record, Acknowledgment item) {
      /*  String value = record.value();
        ProcessBefore processBefore = JSONObject.parseObject(value, ProcessBefore.class);

        String orgNames = task02Client.getOrgNameByDomianId(processBefore.getDomianId());
        log.info("兑换名称成功" + orgNames);
        ProcessAfter processAfter = changeBeforeToAfter(processBefore);
        processAfter.setOrgNames(orgNames);
        processAfterRepository.save(processAfter);
        log.info("保存成功");*/
        log.info("收到" + record.value());
        //手动提交
        item.acknowledge();
    }

    private ProcessAfter changeBeforeToAfter(ProcessBefore processBefore) {
        ProcessAfter processAfter = new ProcessAfter();
        processAfter.setUuid(processBefore.getUuid());
        processAfter.setName(processBefore.getName());
        processAfter.setSip(processBefore.getSip());
        processAfter.setDip(processBefore.getDip());
        return processAfter;
    }
}
