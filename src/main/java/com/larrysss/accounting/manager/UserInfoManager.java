package com.larrysss.accounting.manager;

import com.larrysss.accounting.model.common.UserInfo;

public interface UserInfoManager {
    /**
     * Get user information by user id
     * */
    UserInfo getUserInfoByUserId(Long userId);
}
