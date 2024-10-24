package com.turnip.aiadmin.mapper;

import com.turnip.aiadmin.model.entity.RoleEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Turnip
 * @since 2024-10-22
 */
public interface RoleMapper extends BaseMapper<RoleEntity> {
    public List<RoleEntity> getRoleList();
}
