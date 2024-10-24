package com.turnip.aiadmin.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author Turnip
 * @since 2024-10-22
 */
@Getter
@Setter
@TableName("role")
public class RoleEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 唯一标识角色的 ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 角色的具体名称，用于区分不同的角色类型
     */
    @TableField("name")
    private String name;

    /**
     * 对角色的简要介绍，说明该角色的主要职责和权限范围
     */
    @TableField("intro")
    private String intro;

    /**
     * 记录角色创建的时间点 1
     */
    @TableField("create_time")
    private LocalDateTime createTime;


    /**
     * 记录角色信息更新的时间点 2
     */
    @TableField("update_time")
    private LocalDateTime updateTime;
}
