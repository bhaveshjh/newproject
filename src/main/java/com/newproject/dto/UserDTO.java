package com.newproject.dto;

import jakarta.persistence.Column;
import lombok.Data;

import javax.persistence.Id;

@Data
public class UserDTO {

    @Id
    private String username;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private String password;

}
