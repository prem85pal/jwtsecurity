package com.jwtsecurity.model;


import com.jwtsecurity.enums.Privileges;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Privilege extends Auditable<String> {

    @Enumerated(EnumType.STRING)
    private Privileges name;

    private String description;

    public Privileges getName() {
        return name;
    }

    public void setName(Privileges name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
