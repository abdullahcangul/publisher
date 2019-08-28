package com.cng.punishment.iu.model;

import com.cng.punishment.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * LoginResponse
 */
@Data
@AllArgsConstructor
public class LoginResponse {


    private Boolean isLogin;
    private Employee employee;
}