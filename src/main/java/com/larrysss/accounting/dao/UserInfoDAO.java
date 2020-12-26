package com.larrysss.accounting.dao;


import com.larrysss.accounting.model.persistence.UserInfo;

public interface UserInfoDAO {
    UserInfo getUserInfoById(Long id);
    void createNewUser(String username,String password);
}
