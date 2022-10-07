package com.liupanlong.task02.service;

import com.liupanlong.task02.dao.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}
