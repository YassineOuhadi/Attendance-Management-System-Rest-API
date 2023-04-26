package com.inn.AttendanceAPI.service;

import com.inn.AttendanceApi.wrapper.UserWrapper;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface UserService {

    ResponseEntity<String> signup(Map<String,String> requestMap);

    ResponseEntity<String> login(Map<String,String> requestMap);

    ResponseEntity<List<UserWrapper>> getAllUsers();

    ResponseEntity<String> update(Map<String,String> requestMap);

    ResponseEntity<String> checkToken();

    ResponseEntity<String> changePassword(Map<String,String> requestMap);

    ResponseEntity<String> forgotPassword(Map<String,String> requestMap);
}
