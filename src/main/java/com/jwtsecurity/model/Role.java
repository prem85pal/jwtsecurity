package com.jwtsecurity.model;


import com.jwtsecurity.enums.Roles;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role extends Auditable<String> {

    @Enumerated(EnumType.STRING)
    private Roles name;

    private String description;

    @ManyToMany
    @JoinTable(name = "role_privilege",
            joinColumns = {@JoinColumn(name = "role_id")},
            inverseJoinColumns = {@JoinColumn(name = "privilege_id")})
    Set<Privilege> privilege;

    public Roles getName() {
        return name;
    }

    public void setName(Roles name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Privilege> getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Set<Privilege> privilege) {
        this.privilege = privilege;
    }
}
