package com.turnip.aiadmin.model.vo.user.userinfo;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class RoleData {

    /**
     * 唯一标识角色的 ID
     */
    private Integer id;

    /**
     * 角色的具体名称，用于区分不同的角色类型
     */
    private String name;

    /**
     * 对角色的简要介绍，说明该角色的主要职责和权限范围
     */
    private String intro;


    /**
     * 记录角色创建的时间点 2
     */
    private LocalDateTime createAt;

    /**
     * 记录角色信息更新的时间点 1
     */
    private LocalDateTime updateAt;


}
