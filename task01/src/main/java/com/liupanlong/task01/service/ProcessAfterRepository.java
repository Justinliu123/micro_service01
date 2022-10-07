package com.liupanlong.task01.service;

import com.liupanlong.task01.dao.ProcessAfter;
import com.liupanlong.task01.dao.ProcessBefore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessAfterRepository extends JpaRepository<ProcessAfter, Long> {
}
