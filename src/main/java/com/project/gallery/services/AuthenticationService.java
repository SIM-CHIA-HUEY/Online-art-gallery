package com.project.gallery.services;

import com.project.gallery.domain.dtos.AccountCreate;

public interface AuthenticationService {
    void create (AccountCreate inputs);
}
