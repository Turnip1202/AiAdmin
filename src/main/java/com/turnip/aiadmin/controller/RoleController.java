package com.turnip.aiadmin.controller;

import com.turnip.aiadmin.model.vo.role.*;
import com.turnip.aiadmin.service.intf.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private IRoleService roleService;
    @PostMapping("/list")
    public RoleListVO list() {
        RoleList roleListData = roleService.getList();
        return RoleListVO.create().setData(roleListData).setReturnCode(0);
    }
    @GetMapping("/{id}/menu")
    public RoleMenuVO getRoleMenu(@PathVariable("id") Long id) {
        List<RoleMenuList> roleMenu = roleService.getRoleMenu(id);
        return  RoleMenuVO.create().setData(roleMenu).setReturnCode(0);
    }

}
