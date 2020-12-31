package com.larrysss.accounting.converter.c2s;

import com.google.common.base.Converter;
import com.larrysss.accounting.model.common.UserInfo;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class UserInfoC2SConverter extends Converter<UserInfo, com.larrysss.accounting.model.service.UserInfo> {

    @Override
    protected com.larrysss.accounting.model.service.UserInfo doForward(UserInfo userInfo) {
        return com.larrysss.accounting.model.service.UserInfo.builder()
                .id(userInfo.getId())
                .username(userInfo.getUsername())
                .build();
    }

    @Override
    protected UserInfo doBackward(com.larrysss.accounting.model.service.UserInfo userInfo) {
        return UserInfo.builder()
                .id(userInfo.getId())
                .password(userInfo.getPassword())
                .username(userInfo.getUsername())
                .build();
    }
}
