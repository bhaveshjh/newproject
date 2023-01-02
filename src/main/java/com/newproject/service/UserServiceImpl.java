package com.newproject.service;

import com.newproject.dto.UserDTO;
import com.newproject.entities.User;
import com.newproject.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Override
    public void login(UserDTO userDTO) {

    }

    @Override
    public void register(UserDTO userDTO) {

        User user = mapToEO(userDTO);
        userRepo.save(user);
    }

    private User mapToEO(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        return user;
    }
}

