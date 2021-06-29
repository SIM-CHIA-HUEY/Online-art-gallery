package com.project.gallery.controllers;

import com.project.gallery.domain.dtos.AccountCreate;
import com.project.gallery.domain.dtos.AccountLogin;
import com.project.gallery.security.IdToken;
import com.project.gallery.services.AuthenticationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/account")
public class AuthenticationController {
    private final AuthenticationService service;

    public AuthenticationController (AuthenticationService service){
        this.service = service;
    }

    @PostMapping
    public void create (@RequestBody @Valid AccountCreate inputs){
        service.create(inputs);
    }

    @PostMapping("/login")
    public IdToken login(@Valid @RequestBody AccountLogin inputs) {
        return service.login(inputs);
    }


}
