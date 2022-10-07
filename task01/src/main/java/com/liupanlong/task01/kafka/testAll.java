package com.liupanlong.task01.kafka;

import com.alibaba.fastjson.JSONObject;
import com.liupanlong.task01.dao.ProcessBefore;
import com.liupanlong.task01.dao.UserInfo;

import java.util.UUID;

public class testAll {
    public static void main(String[] args) {
        ProcessBefore processBefore = new ProcessBefore();
        processBefore.setDomianId(3215L);
        String str = "{\"dip\":\"目标ip\",\"domianId\":12321,\"name\":\"这是警告名\",\"sip\":\"来源ip\",\"uuid\":\"50d5706f-c55e-4e81-b4be-0305554936e2\"}";
        System.out.println(str);
        System.out.println(JSONObject.parseObject(str, ProcessBefore.class).toString());;
    }
}
