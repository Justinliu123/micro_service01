package com.liupanlong.task01.dao;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "process_after")
@Data
public class ProcessAfter {

    @Id
    @Column(name = "uuid", length = 64)
    private String uuid;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "sip", length = 255)
    private String sip;

    @Column(name = "dip", length = 255)
    private String dip;

    @Column(name = "org_names", length = 255)
    private String orgNames;
}