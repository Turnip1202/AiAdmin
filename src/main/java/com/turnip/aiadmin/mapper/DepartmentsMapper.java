package com.turnip.aiadmin.mapper;

import com.turnip.aiadmin.model.entity.DepartmentsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.turnip.aiadmin.model.vo.department.DepartmentListVO;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Turnip
 * @since 2024-10-22
 */
public interface DepartmentsMapper extends BaseMapper<DepartmentsEntity> {
    List<DepartmentsEntity> getDepartmentList();
}
