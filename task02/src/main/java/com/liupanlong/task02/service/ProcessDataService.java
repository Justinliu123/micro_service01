package com.liupanlong.task02.service;

import com.liupanlong.task02.dao.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessDataService {
    @Autowired
    private OrganizationRepository organizationRepository;

    public String getOrgNameByDomianId(Long domianId) {
        Organization organization = organizationRepository.findById(domianId).get();
        return organization.getOrgNames();
    }
}
