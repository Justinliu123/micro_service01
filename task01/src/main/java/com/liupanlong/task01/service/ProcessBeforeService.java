package com.liupanlong.task01.service;

import com.alibaba.fastjson.JSONObject;
import com.liupanlong.task01.dao.ProcessBefore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProcessBeforeService {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private ProcessBeforeRepository processBeforeRepository;

    public void insertBigData() {
        List<ProcessBefore> processBefores = new ArrayList<>();
        for(int i = 0; i < 6000; i++)  {
            processBefores.add(makeProcessBefore());
        }
        processBeforeRepository.saveAll(processBefores);
    }

    private ProcessBefore makeProcessBefore() {
        ProcessBefore processBefore = new ProcessBefore();
        processBefore.setUuid(UUID.randomUUID().toString());
        processBefore.setName("这是警告名");
        processBefore.setSip("来源ip");
        processBefore.setDip("目标ip");
        processBefore.setDomianId(12321L);
        return processBefore;
    }

    public void sendMessages() {
        List<ProcessBefore> allData = processBeforeRepository.findAll();
        for(ProcessBefore processBefore : allData) {
            String value = JSONObject.toJSONString(processBefore);
            kafkaTemplate.send("topic_test", "key1", value);
        }
    }
}
