package com.turnip.aiadmin.model.vo.role;

import com.turnip.aiadmin.model.vo.BaseVO;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RoleListVO extends BaseVO {
    private RoleList data;
    public static RoleListVO create() {
        return new RoleListVO();
    }
    public RoleListVO setData(RoleList data) {
        this.data = data;
        return this;
    }
}
