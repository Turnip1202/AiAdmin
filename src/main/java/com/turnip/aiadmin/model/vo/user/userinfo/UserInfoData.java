package com.turnip.aiadmin.model.vo.user.userinfo;

import com.turnip.aiadmin.model.vo.department.DepartmentListData;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class UserInfoData {
    private long id;
    private String name;
    private String realname;
    private Byte enable;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private RoleData role;
    private DepartmentListData department;
    private String cellphone;
    private Integer departmentId;
    private Integer roleId;
}
