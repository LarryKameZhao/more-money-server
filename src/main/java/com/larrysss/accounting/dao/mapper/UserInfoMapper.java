package com.larrysss.accounting.dao.mapper;

import com.larrysss.accounting.model.persistence.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserInfoMapper {
    @Select("SELECT id,username,password,create_time,update_time from hcas_userinfo WHERE id = #{id}")
    public UserInfo getUserInfoByUserId(@Param("id") Long id);
}
