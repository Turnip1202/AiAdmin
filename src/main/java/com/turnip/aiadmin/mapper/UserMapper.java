package com.turnip.aiadmin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.turnip.aiadmin.model.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author turni
* @description 针对表【user】的数据库操作Mapper
* @createDate 2024-10-15 16:01:09
* @Entity com.turnip.aiadmin.mapper.UserEntity
*/
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
    List<UserEntity> getUserInfo(String name);
    Integer updateLastLoginDateById(Integer id);
    UserEntity getUserInfoById(Long id);

}




