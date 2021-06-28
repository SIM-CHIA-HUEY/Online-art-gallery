package com.project.gallery.domain.entities;

import javax.persistence.*;

@Entity
@Table(name="ROLES")
public class UserRole {

    @Id
    @Column (name = "ROLE_CODE",nullable = false)
    private Long roleCode;

    @Column (name = "ROLE_NAME",nullable = false)
    private String roleName;

    public UserRole(){
        //
    }


    public Long getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(Long role) {
        this.roleCode = role;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "roleCode='" + roleCode + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}

