package com.liupanlong.task01.service;

import com.liupanlong.task01.dao.ProcessBefore;
import com.liupanlong.task01.dao.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessBeforeRepository extends JpaRepository<ProcessBefore, String> {
}
