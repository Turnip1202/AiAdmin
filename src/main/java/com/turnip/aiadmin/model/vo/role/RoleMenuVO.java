package com.turnip.aiadmin.model.vo.role;

import com.turnip.aiadmin.model.vo.BaseVO;
import lombok.Data;

import java.util.List;
@Data
public class RoleMenuVO extends BaseVO {
    private List<RoleMenuList> data;
    public static RoleMenuVO create() {
        return new RoleMenuVO();
    }
    public RoleMenuVO setData(List<RoleMenuList> data) {
        this.data = data;
        return this;
    }
}
