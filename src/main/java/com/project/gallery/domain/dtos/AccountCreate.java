package com.project.gallery.domain.dtos;

import com.project.gallery.domain.entities.UserRole;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AccountCreate {

    @Size(max = 255)
    @Email
    private String email;

    @NotBlank
    @Size(min = 8, max = 12)
    private String password;

    private Long roleCode ;

    public AccountCreate(){
        //
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(Long roleCode) {
        this.roleCode = roleCode;
    }

    @Override
    public String toString() {
        return "AccountCreate{" +
                "email='" + email +
                ", password=PROTECTED, roleCode=" + roleCode +
                '}';
    }
}
