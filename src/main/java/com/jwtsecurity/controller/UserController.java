package com.jwtsecurity.controller;


import com.jwtsecurity.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String test() {
        return "hello";
    }


    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<UserDto> saveUser() {

        UserDto userDto = new UserDto();

        return ResponseEntity.ok(userDto);
    }


}
