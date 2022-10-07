package com.liupanlong.task01.kafka;

import com.alibaba.fastjson.JSONObject;
import com.liupanlong.task01.dao.ProcessBefore;
import com.liupanlong.task01.dao.UserInfo;

import java.util.UUID;

public class testAll {
    public static void main(String[] args) {
        ProcessBefore processBefore = new ProcessBefore();
        processBefore.setDomianId(3215L);
        String str = JSONObject.toJSONString(processBefore);
        System.out.println(str);
        System.out.println(JSONObject.parseObject(str, ProcessBefore.class).toString());;
    }
}
