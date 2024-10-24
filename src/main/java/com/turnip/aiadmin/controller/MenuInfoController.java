package com.turnip.aiadmin.controller;

import com.turnip.aiadmin.model.vo.menu.MenuList;
import com.turnip.aiadmin.model.vo.menu.MenuListVO;
import com.turnip.aiadmin.model.vo.role.RoleMenuList;
import com.turnip.aiadmin.service.intf.IMenuInfoService;
import com.turnip.aiadmin.service.intf.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
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
 * @since 2024-10-23
 */
@RestController
@RequestMapping("/menu")
public class MenuInfoController {
    @Autowired
    private IMenuInfoService menuInfoService;
    @PostMapping("/list")
    public MenuListVO list() {
        List<RoleMenuList> menuListJSON = menuInfoService.getMenuListJSON();
        MenuList menuList = new MenuList();
        menuList.setList(menuListJSON);
        return  MenuListVO.create().setData(menuList).setReturnCode(0);
    }

}
