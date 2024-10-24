package com.turnip.aiadmin.model.vo.role;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;


@Data
public class RoleListData {
    private  Long id;
    private String name;
    private String intro;
    private List<RoleMenuList> menuList;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
