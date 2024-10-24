package com.turnip.aiadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.turnip.aiadmin.model.dto.UserLoginHistroyDTO;
import com.turnip.aiadmin.model.entity.UserLoginHistoryEntity;
import com.turnip.aiadmin.service.UserLoginHistoryService;
import com.turnip.aiadmin.mapper.UserLoginHistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author turni
* @description 针对表【user_login_history(用户登录历史记录)】的数据库操作Service实现
* @createDate 2024-10-15 17:10:57
*/
@Service
public class UserLoginHistoryServiceImpl extends ServiceImpl<UserLoginHistoryMapper, UserLoginHistoryEntity>
    implements UserLoginHistoryService{
    @Autowired
    private UserLoginHistoryMapper userLoginHistoryMapper;

    @Override
    public Integer insertLastLoginInfo(UserLoginHistroyDTO userLoginHistroyDTO) {
        UserLoginHistoryEntity userLoginHistoryEntity = new UserLoginHistoryEntity();
        userLoginHistoryEntity.setUserId(userLoginHistroyDTO.getUserId());
        userLoginHistoryEntity.setIpAddress(userLoginHistroyDTO.getIpAddress());
        return userLoginHistoryMapper.insert(userLoginHistoryEntity);
    }
}




