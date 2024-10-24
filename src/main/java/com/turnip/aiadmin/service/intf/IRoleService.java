package com.turnip.aiadmin.service.intf;

import com.turnip.aiadmin.model.entity.RoleEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.turnip.aiadmin.model.vo.role.RoleList;
import com.turnip.aiadmin.model.vo.role.RoleListData;
import com.turnip.aiadmin.model.vo.role.RoleListVO;
import com.turnip.aiadmin.model.vo.role.RoleMenuList;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Turnip
 * @since 2024-10-22
 */
public interface IRoleService extends IService<RoleEntity> {
   public RoleList getList();
   public List<RoleMenuList> getRoleMenu(Long id);
}
