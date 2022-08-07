package com.mmutawe.explore.custom.validation.customvalidationdemo.controller;

import com.mmutawe.explore.custom.validation.customvalidationdemo.dto.UserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @PostMapping("/user")
    public UserDto saveUser(@Valid @RequestBody UserDto requestUser){

        UserDto user = new UserDto(
                requestUser.getId(),
                requestUser.getName(),
                requestUser.getPhoneNumber()
        );

        System.out.println("Success!!!\n" + user);

        return user;
    }
}
