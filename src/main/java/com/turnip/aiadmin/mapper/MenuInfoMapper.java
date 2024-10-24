package com.turnip.aiadmin.mapper;

import com.turnip.aiadmin.model.entity.MenuInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.turnip.aiadmin.model.entity.expand.MenuInfoEntityExpand;
import com.turnip.aiadmin.model.vo.role.RoleMenuList;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Turnip
 * @since 2024-10-23
 */
public interface MenuInfoMapper extends BaseMapper<MenuInfoEntity> {
    List<MenuInfoEntityExpand> getMenuListData();
    List<RoleMenuList> getMenuListJSON();
}
