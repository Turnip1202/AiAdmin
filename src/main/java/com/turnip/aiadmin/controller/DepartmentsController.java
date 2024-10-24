package com.turnip.aiadmin.controller;

import com.turnip.aiadmin.model.vo.department.DepartmentList;
import com.turnip.aiadmin.model.vo.department.DepartmentListData;
import com.turnip.aiadmin.model.vo.department.DepartmentListVO;
import com.turnip.aiadmin.service.intf.IDepartmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Turnip
 * @since 2024-10-22
 */
@RestController
@RequestMapping("/department")
public class DepartmentsController {
    @Autowired
    public IDepartmentsService departmentsService;

    @PostMapping("/list")
    public DepartmentListVO getDepartmentList()
    {
        List<DepartmentListData> departmentListData = departmentsService.getDepartmentList();
        DepartmentList departmentList = new DepartmentList();
        departmentList.setList(departmentListData);
        return DepartmentListVO.create().setData(departmentList).setReturnCode(0);
    }

}
