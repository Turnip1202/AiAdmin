package com.turnip.aiadmin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.turnip.aiadmin.model.entity.UserEntity;
import com.turnip.aiadmin.model.vo.user.userinfo.UserInfoData;
import com.turnip.aiadmin.model.vo.user.userinfo.UserInfoVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author turni
* @description 针对表【user】的数据库操作Service
* @createDate 2024-10-15 16:01:09
*/
public interface UserService extends IService<UserEntity> {
    List<UserEntity> getUserInfo(String name);
    Integer updateLastLoginDateById(Integer id);
    UserInfoData getUserInfoById(@Param("id") Long id);

}
