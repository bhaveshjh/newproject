package com.newproject.service;

import com.newproject.dto.UserDTO;

public interface UserService {
    void login(UserDTO userDTO);

    void register(UserDTO userDTO);
}
