package com.turnip.aiadmin.service.impl;

import com.turnip.aiadmin.model.entity.MenuInfoEntity;
import com.turnip.aiadmin.mapper.MenuInfoMapper;
import com.turnip.aiadmin.model.entity.expand.MenuInfoEntityExpand;
import com.turnip.aiadmin.model.vo.role.RoleMenuList;
import com.turnip.aiadmin.service.intf.IMenuInfoService;
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
 * @since 2024-10-23
 */
@Service
public class MenuInfoServiceImpl extends ServiceImpl<MenuInfoMapper, MenuInfoEntity> implements IMenuInfoService {

    @Autowired
    private MenuInfoMapper menuInfoMapper;
    @Override
    public List<MenuInfoEntityExpand> getMenuList() {
        List<MenuInfoEntityExpand> menuListDta = menuInfoMapper.getMenuListData();
        return menuListDta;
    }

    @Override
    public List<RoleMenuList> getMenuListJSON() {
        List<RoleMenuList> menuListJSON = menuInfoMapper.getMenuListJSON();
        return menuListJSON;
    }
}
