package com.jwtsecurity.model;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;


@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}


