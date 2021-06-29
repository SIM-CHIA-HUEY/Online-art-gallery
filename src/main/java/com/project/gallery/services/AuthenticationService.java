package com.project.gallery.services;

import com.project.gallery.domain.dtos.AccountCreate;
import com.project.gallery.domain.dtos.AccountLogin;
import com.project.gallery.security.IdToken;

public interface AuthenticationService {
    void create (AccountCreate inputs);

    IdToken login(AccountLogin credentialsInput);
}
