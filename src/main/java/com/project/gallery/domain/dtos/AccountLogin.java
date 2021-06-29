package com.project.gallery.domain.dtos;

import javax.validation.constraints.NotBlank;

public class AccountLogin {

    @NotBlank
    private String email;

    @NotBlank
    private String password;

    public AccountLogin() {
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

    @Override
    public String toString() {
        return "AccountCreate [email=" + email + ", password=PROTECTED]";
    }
}
