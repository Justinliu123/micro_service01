package com.liupanlong.task01.dao;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "process_before")
@Data
public class ProcessBefore {

    @Id
    @Column(name = "uuid", length = 64)
    private String uuid;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "sip", length = 255)
    private String sip;

    @Column(name = "dip", length = 255)
    private String dip;

    @Column(name = "domian_id")
    private Long domianId;
}
