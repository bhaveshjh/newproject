package com.newproject.controller;

import com.newproject.dto.UserDTO;
import com.newproject.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    public ResponseEntity home(){
        return ResponseEntity.status(HttpStatus.OK).body("This is Home Page");
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody UserDTO userDTO){
        this.userService.login(userDTO);
        return ResponseEntity.status(HttpStatus.OK).body("This is login Page");
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody UserDTO userDTO){
        log.info("Register controller started");
        this.userService.register(userDTO);
        return ResponseEntity.status(HttpStatus.OK).body("This is signup Page");
    }
}
