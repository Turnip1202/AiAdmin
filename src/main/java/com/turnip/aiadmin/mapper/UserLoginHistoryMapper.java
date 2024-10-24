package com.turnip.aiadmin.mapper;

import com.turnip.aiadmin.model.entity.UserLoginHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author turni
* @description 针对表【user_login_history(用户登录历史记录)】的数据库操作Mapper
* @createDate 2024-10-15 17:10:57
* @Entity com.turnip.aiadmin.model.entity.UserLoginHistoryEntity
*/
@Mapper
public interface UserLoginHistoryMapper extends BaseMapper<UserLoginHistoryEntity> {

}




