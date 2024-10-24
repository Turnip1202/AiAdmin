package com.turnip.aiadmin.model.vo.menu;

import com.turnip.aiadmin.model.vo.BaseVO;
import lombok.Data;

@Data
public class MenuListVO extends BaseVO {
    private MenuList data;
    public static MenuListVO create() {
        return new MenuListVO();
    }
    public MenuListVO setData(MenuList data) {
        this.data = data;
        return this;
    }
}
