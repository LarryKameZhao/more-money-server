package com.larrysss.accounting.dao;

import com.larrysss.accounting.model.persistence.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public class UserInfoDAOImpl implements UserInfoDAO{
    @Override
    public UserInfo getUserInfoById(Long id) {
        return null;
    }

    @Override
    public void createNewUser(String username, String password) {

    }
}
