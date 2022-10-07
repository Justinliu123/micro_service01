package com.liupanlong.task02.dao;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "organization")
@Data
public class Organization {

    @Id
    @Column(name = "domian_id")
    private Long domianID;

    @Column(name = "org_names", length = 255)
    private String orgNames;
}