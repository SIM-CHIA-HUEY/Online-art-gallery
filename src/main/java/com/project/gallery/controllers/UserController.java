package com.project.gallery.controllers;

import com.project.gallery.domain.dtos.ArtistInfoCreate;
import com.project.gallery.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService ;

    public UserController (UserService userService){
        this.userService = userService ;
    }
    @PostMapping("/artist")
    public void artistCreate (@Valid @RequestBody ArtistInfoCreate newArtistInfo){
        userService.artistCreate(newArtistInfo);
    }
}
