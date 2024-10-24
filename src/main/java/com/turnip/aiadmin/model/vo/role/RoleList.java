package com.turnip.aiadmin.model.vo.role;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class RoleList {
    private List<RoleListData> list;
}
