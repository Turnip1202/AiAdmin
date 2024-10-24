package com.turnip.aiadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.turnip.aiadmin.model.entity.DepartmentsEntity;
import com.turnip.aiadmin.model.entity.RoleEntity;
import com.turnip.aiadmin.model.entity.UserEntity;
import com.turnip.aiadmin.model.vo.department.DepartmentListData;
import com.turnip.aiadmin.model.vo.user.userinfo.RoleData;
import com.turnip.aiadmin.model.vo.user.userinfo.UserInfoData;
import com.turnip.aiadmin.model.vo.user.userinfo.UserInfoVO;
import com.turnip.aiadmin.service.UserService;
import com.turnip.aiadmin.mapper.UserMapper;
import com.turnip.aiadmin.service.intf.IDepartmentsService;
import com.turnip.aiadmin.service.intf.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author turni
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-10-15 16:01:09
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity>
    implements UserService{
    @Autowired
    public UserMapper userMapper;
    @Autowired
    public IDepartmentsService departmentsService;
    @Autowired
    public  IRoleService roleService;
    @Override
    public List<UserEntity> getUserInfo(String name) {
        System.out.println("name"+name);
        return userMapper.getUserInfo(name);
    }

    @Override
    public Integer updateLastLoginDateById(Integer id) {
        return userMapper.updateLastLoginDateById(id);
    }

    @Override
    public UserInfoData getUserInfoById(Long id) {
       UserEntity  userInfo = userMapper.getUserInfoById(id);
        System.out.println("sss"+userInfo);

        UserInfoData userInfoData = new UserInfoData();

        userInfoData.setId(userInfo.getId());
        userInfoData.setName(userInfo.getUserName());
        userInfoData.setRealname(userInfo.getRealName());
        userInfoData.setEnable(userInfo.getEnable());
        userInfoData.setCreateAt(userInfo.getUserCreateTime());
        userInfoData.setUpdateAt(userInfo.getUpdatedTime());

        DepartmentsEntity departmentsEntity = departmentsService.getById(userInfo.getDepartmentId());
        DepartmentListData departmentListData = new DepartmentListData();
        departmentListData.setId(departmentsEntity.getId());
        departmentListData.setParentId(departmentsEntity.getParentId());
        departmentListData.setName(departmentsEntity.getDepartmentName());
        departmentListData.setLeader(departmentsEntity.getLeader());
        departmentListData.setCreateAt(departmentsEntity.getCreateAt());
        departmentListData.setUpdateAt(departmentsEntity.getUpdateAt());
        userInfoData.setDepartment(departmentListData);



        RoleEntity roleEntity =roleService.getById(userInfo.getUserRoleId());
        RoleData roleData = new RoleData();
       roleData.setId(roleEntity.getId());
       roleData.setName(roleEntity.getName());
       roleData.setIntro(roleEntity.getIntro());
       roleData.setCreateAt(roleEntity.getCreateTime());
       roleData.setUpdateAt(roleEntity.getCreateTime());
       userInfoData.setRole(roleData);


        return userInfoData;
    }

}




