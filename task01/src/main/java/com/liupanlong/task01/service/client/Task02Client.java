package com.liupanlong.task01.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("task02")
public interface Task02Client {
    @RequestMapping("/changeData/{domianId}")
    String getOrgNameByDomianId(@PathVariable("domainId") Long domianId);
}
