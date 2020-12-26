package com.larrysss.accounting.controllers;

import com.larrysss.accounting.converter.c2s.UserInfoConverter;
import com.larrysss.accounting.manager.UserInfoManager;
import com.larrysss.accounting.model.service.UserInfo;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/users")
@Slf4j
public class UserController {
    private final UserInfoManager userInfoManager;
    private final UserInfoConverter userInfoConverter;

    @Autowired
    public UserController(final UserInfoManager userInfoManager, final UserInfoConverter userInfoConverter) {
        this.userInfoManager = userInfoManager;
        this.userInfoConverter = userInfoConverter;
    }

    @GetMapping("/{id}")
    public UserInfo getUserInfoByUserId(@PathVariable("id") Long userId) {
        val userInfo = userInfoManager.getUserInfoByUserId(userId);
        return userInfoConverter.convert(userInfo);
    }
}
