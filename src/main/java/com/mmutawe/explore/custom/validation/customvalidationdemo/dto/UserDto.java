package com.mmutawe.explore.custom.validation.customvalidationdemo.dto;


import com.mmutawe.explore.custom.validation.customvalidationdemo.validation.UserIdValidation;
import com.mmutawe.explore.custom.validation.customvalidationdemo.validation.UserNameValidation;
import com.mmutawe.explore.custom.validation.customvalidationdemo.validation.UserPhoneValidation;

public class UserDto {

    @UserIdValidation()
    private Long id;

    @UserNameValidation()
    private String name;

    @UserPhoneValidation()
    private String phoneNumber;

    public UserDto(){
    }

    public UserDto(Long id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
