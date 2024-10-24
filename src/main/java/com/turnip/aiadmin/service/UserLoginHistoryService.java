package com.turnip.aiadmin.service;

import com.turnip.aiadmin.model.dto.UserLoginHistroyDTO;
import com.turnip.aiadmin.model.entity.UserLoginHistoryEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author turni
* @description 针对表【user_login_history(用户登录历史记录)】的数据库操作Service
* @createDate 2024-10-15 17:10:57
*/
public interface UserLoginHistoryService extends IService<UserLoginHistoryEntity> {
    Integer insertLastLoginInfo(UserLoginHistroyDTO userLoginHistroyDTO);
}
