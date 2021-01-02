package com.larrysss.accounting.controllers;

import com.larrysss.accounting.converter.c2s.UserInfoC2SConverter;
import com.larrysss.accounting.exception.ErrorResponse;
import com.larrysss.accounting.exception.InvalidParameterException;
import com.larrysss.accounting.exception.ResourceNotFoundException;
import com.larrysss.accounting.exception.ServiceException;
import com.larrysss.accounting.manager.UserInfoManager;
import com.larrysss.accounting.model.service.UserInfo;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

@RestController
@RequestMapping("v1/users")
@Slf4j
public class UserController {
    private final UserInfoManager userInfoManager;
    private final UserInfoC2SConverter userInfoC2SConverter;

    @Autowired
    public UserController(final UserInfoManager userInfoManager, final UserInfoC2SConverter userInfoC2SConverter) {
        this.userInfoManager = userInfoManager;
        this.userInfoC2SConverter = userInfoC2SConverter;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserInfo> getUserInfoByUserId(@PathVariable("id") Long userId) {
        log.debug("get user info by user id {}", userId);
        if(userId == null || userId<=0) {
            throw new InvalidParameterException("User id invalid");
        }
        val userInfo = userInfoManager.getUserInfoByUserId(userId);
        return ResponseEntity.ok(userInfoC2SConverter.convert(userInfo));

    }
}
