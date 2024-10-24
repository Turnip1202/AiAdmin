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
 * @since 2024-10-23
 */
@Getter
@Setter
@TableName("menu_info")
public class MenuInfoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单 ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 菜单名称
     */
    @TableField("name")
    private String name;

    /**
     * 菜单类型
     */
    @TableField("type")
    private Integer type;

    /**
     * 菜单链接
     */
    @TableField("url")
    private String url;

    /**
     * 菜单图标
     */
    @TableField("icon")
    private String icon;

    /**
     * 排序序号
     */
    @TableField("sort")
    private Integer sort;

    /**
     * 创建时间
     */
    @TableField("createAt")
    private LocalDateTime createAt;

    /**
     * 更新时间
     */
    @TableField("updateAt")
    private LocalDateTime updateAt;

    /**
     * 菜单权限
     */
    @TableField("permission")
    private String permission;
}
