package com.liupanlong.task02.controller;

import com.liupanlong.task02.service.ProcessDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcessDataController {

    @Autowired
    private ProcessDataService processDataService;

    @RequestMapping("/changeData/{domianId}")
    public String getOrgNameByDomianId(@PathVariable("domianId") Long domianId) {
        return processDataService.getOrgNameByDomianId(domianId);
    }
}
