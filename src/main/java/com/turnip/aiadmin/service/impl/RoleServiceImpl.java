package com.turnip.aiadmin.service.impl;

import com.alibaba.fastjson2.JSONArray;
import com.turnip.aiadmin.model.entity.MenuInfoEntity;
import com.turnip.aiadmin.model.entity.RoleEntity;
import com.turnip.aiadmin.mapper.RoleMapper;
import com.turnip.aiadmin.model.entity.expand.MenuInfoEntityExpand;
import com.turnip.aiadmin.model.vo.role.RoleList;
import com.turnip.aiadmin.model.vo.role.RoleListData;
import com.turnip.aiadmin.model.vo.role.RoleListVO;
import com.turnip.aiadmin.model.vo.role.RoleMenuList;
import com.turnip.aiadmin.service.intf.IMenuInfoService;
import com.turnip.aiadmin.service.intf.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Turnip
 * @since 2024-10-22
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, RoleEntity> implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private IMenuInfoService menuInfoService;
    @Override
    public RoleList getList() {
        List<RoleEntity> roleList = roleMapper.getRoleList();



        //得到角色信息列表
        List<RoleListData> roleListDataList = roleList.stream().map(roleEntity -> {
            RoleListData roleListData = new RoleListData();
            roleListData.setId(Long.valueOf(roleEntity.getId()));
            roleListData.setName(roleEntity.getName());
            roleListData.setIntro(roleEntity.getIntro());
            roleListData.setCreateAt(roleEntity.getCreateTime());
            roleListData.setUpdateAt(roleEntity.getUpdateTime());
            return roleListData;
        }).toList();

        //得到菜单信息列表
//        List<MenuInfoEntityExpand> menuList = menuInfoService.getMenuList();
        List<RoleMenuList> menuList = menuInfoService.getMenuListJSON();
        System.out.println("menuList"+menuList);
        List<RoleMenuList> roleMenuListList = menuList.stream().map(menuInfoEntity -> {
            RoleMenuList roleMenuList = new RoleMenuList();
            roleMenuList.setId(Long.valueOf(menuInfoEntity.getId()));
            roleMenuList.setName(menuInfoEntity.getName());
            roleMenuList.setIcon(menuInfoEntity.getIcon());
            roleMenuList.setType(menuInfoEntity.getType());
            roleMenuList.setSort(menuInfoEntity.getSort());
            roleMenuList.setUrl(menuInfoEntity.getUrl());
            roleMenuList.setPermission(menuInfoEntity.getPermission());
            if (menuInfoEntity.getParentId() != null)
                roleMenuList.setParentId(Long.valueOf(menuInfoEntity.getParentId()));
            JSONArray array =JSONArray.parseArray(menuInfoEntity.getChildren().toString());
            roleMenuList.setChildren(array);
            return roleMenuList;
        }).toList();
        //遍历角色信息，将菜单信息合并到角色信息中
        for (RoleListData roleListData : roleListDataList) {
            roleListData.setMenuList(roleMenuListList);
        }

        RoleList ListData = new RoleList();
        ListData.setList(roleListDataList);

        return ListData;
    }

    @Override
    public List<RoleMenuList> getRoleMenu(Long id) {
        List<RoleMenuList> menuList = menuInfoService.getMenuListJSON();
        List<RoleMenuList> newMenuList = menuList.stream().map(menuInfoEntity -> {
            RoleMenuList roleMenuList = new RoleMenuList();
            roleMenuList.setId(Long.valueOf(menuInfoEntity.getId()));
            roleMenuList.setName(menuInfoEntity.getName());
            roleMenuList.setIcon(menuInfoEntity.getIcon());
            roleMenuList.setType(menuInfoEntity.getType());
            roleMenuList.setSort(menuInfoEntity.getSort());
            roleMenuList.setUrl(menuInfoEntity.getUrl());
            roleMenuList.setPermission(menuInfoEntity.getPermission());
            if (menuInfoEntity.getParentId() != null)
                roleMenuList.setParentId(Long.valueOf(menuInfoEntity.getParentId()));
            JSONArray array =JSONArray.parseArray(menuInfoEntity.getChildren().toString());
            roleMenuList.setChildren(array);
            return roleMenuList;
        }).toList();

        return newMenuList;
    }
}
