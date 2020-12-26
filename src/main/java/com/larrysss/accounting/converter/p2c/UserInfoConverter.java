package com.larrysss.accounting.converter.p2c;

import com.google.common.base.Converter;
import com.larrysss.accounting.model.persistence.UserInfo;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class UserInfoConverter extends Converter<UserInfo, com.larrysss.accounting.model.common.UserInfo> {
    @Override
    protected com.larrysss.accounting.model.common.UserInfo doForward(UserInfo userInfo) {
        return com.larrysss.accounting.model.common.UserInfo.builder().build();
    }

    @Override
    protected UserInfo doBackward(com.larrysss.accounting.model.common.UserInfo userInfo) {
        return UserInfo.builder().build();
    }
}
