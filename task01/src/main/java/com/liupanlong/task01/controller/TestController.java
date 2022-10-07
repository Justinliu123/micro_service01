package com.liupanlong.task01.controller;

import com.liupanlong.task01.service.ProcessBeforeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @Autowired
    private ProcessBeforeService processBeforeService;

    @RequestMapping("insert")
    public String insertBigData() {
        String result;
        try {
            processBeforeService.insertBigData();
            result = "插入成功!";
        } catch (Exception e) {
            result = e.getMessage();
        }
        return result;
    }

    @RequestMapping("sendKafka")
    public String sendKafka() {
        String resultStr;
        try {
            processBeforeService.sendMessages();
            resultStr = "向kafka发送数据成功！";
        } catch (Exception e) {
            log.info(e.getMessage());
            resultStr = "向kafka发送数据失败！";
        }
        return resultStr;
    }
}
