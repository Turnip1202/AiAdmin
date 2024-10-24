package com.turnip.aiadmin.service.intf;

import com.turnip.aiadmin.model.entity.MenuInfoEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.turnip.aiadmin.model.entity.expand.MenuInfoEntityExpand;
import com.turnip.aiadmin.model.vo.role.RoleMenuList;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Turnip
 * @since 2024-10-23
 */
public interface IMenuInfoService extends IService<MenuInfoEntity> {
    List<MenuInfoEntityExpand> getMenuList();
    List<RoleMenuList> getMenuListJSON();
}
