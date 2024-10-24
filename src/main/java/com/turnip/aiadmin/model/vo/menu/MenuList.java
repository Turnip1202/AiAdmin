package com.turnip.aiadmin.model.vo.menu;

import com.turnip.aiadmin.model.vo.role.RoleMenuList;
import lombok.Data;

import java.util.List;
@Data
public class MenuList {
    private List<RoleMenuList> list;
}
