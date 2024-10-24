package com.turnip.aiadmin.service.intf;

import com.turnip.aiadmin.model.entity.DepartmentsEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.turnip.aiadmin.model.vo.department.DepartmentListData;
import com.turnip.aiadmin.model.vo.department.DepartmentListVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Turnip
 * @since 2024-10-22
 */
public interface IDepartmentsService extends IService<DepartmentsEntity> {
        List<DepartmentListData> getDepartmentList();
}
