package com.larrysss.accounting.manager;

import com.larrysss.accounting.converter.p2c.UserInfoConverter;
import com.larrysss.accounting.dao.UserInfoDAO;
import com.larrysss.accounting.model.common.UserInfo;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserInfoManagerImpl implements UserInfoManager {
    private final UserInfoDAO userInfoDAO;
    private final UserInfoConverter userInfoConverter;

    @Autowired
    public UserInfoManagerImpl(final UserInfoDAO userInfoDAO, final UserInfoConverter userInfoConverter) {
        this.userInfoDAO = userInfoDAO;
        this.userInfoConverter = userInfoConverter;
    }

    @Override
    public UserInfo getUserInfoByUserId(Long userId) {
        val userInfo = userInfoDAO.getUserInfoById(userId);
        return userInfoConverter.convert(userInfo);
    }
}
