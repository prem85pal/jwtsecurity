package com.jwtsecurity.dto;

import javax.validation.constraints.Max;
import java.util.Set;

public class UserDto {

    private Long id;

    private String username;

    private Set<RoleDto> roleDtos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<RoleDto> getRoleDtos() {
        return roleDtos;
    }

    public void setRoleDtos(Set<RoleDto> roleDtos) {
        this.roleDtos = roleDtos;
    }
}
