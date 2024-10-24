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
@TableName("departments")
public class DepartmentsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("departmentName")
    private String departmentName;

    @TableField("parent_id")
    private Integer parentId;

    @TableField("create_time")
    private LocalDateTime createTime;
    @TableField("createAt")
    private LocalDateTime createAt;

    @TableField("update_time")
    private LocalDateTime updateTime;
    @TableField("updateAt")
    private LocalDateTime updateAt;

    @TableField("leader")
    private String leader;
}
