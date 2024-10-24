package com.turnip.aiadmin.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.turnip.aiadmin.constant.enums.UserRoleEnum;
import com.turnip.aiadmin.constant.enums.UserSexEnum;
import com.turnip.aiadmin.constant.enums.UserStatusEnum;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Turnip
 * @since 2024-10-22
 */
@Getter
@Setter
@TableName("user")
@Data
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户 id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    @TableField("user_name")
    private String userName;
    /**
     * 真实姓名
     */
    @TableField("real_name")
    private String realName;


    /**
     * 用户密码
     */
    @TableField("user_password")
    private String userPassword;

    /**
     * 手机号
     */
    @TableField("user_phone")
    private String userPhone;

    /**
     * 用户邮箱
     */
    @TableField("user_email")
    private String userEmail;

    /**
     * 用户性别
     */
    @TableField("user_sex")
    private UserSexEnum userSex;

    /**
     * 用户头像
     */
    @TableField("user_avatar")
    private String userAvatar;

    /**
     * 用户生日
     */
    @TableField("user_birthday")
    private LocalDate userBirthday;

    /**
     * 用户简介
     */
    @TableField("user_bio")
    private String userBio;

    /**
     * 用户状态
     */
    @TableField("user_status")
    private UserStatusEnum userStatus;

    /**
     * 用户角色
     */
    @TableField("user_role")
    private UserRoleEnum userRole;

    /**
     * 用户角色 ID
     */
    @TableField("user_role_id")
    private Integer userRoleId;

    /**
     * 用户注册 IP 地址
     */
    @TableField("user_create_ip")
    private String userCreateIp;

    /**
     * 创建时间
     */
    @TableField("user_create_time")
    private LocalDateTime userCreateTime;

    /**
     * 最后登录时间
     */
    @TableField("last_login_time")
    private LocalDateTime lastLoginTime;

    /**
     * 登录失败次数
     */
    @TableField("login_attempts")
    private Integer loginAttempts;

    /**
     * 更新时间
     */
    @TableField("updated_time")
    private LocalDateTime updatedTime;

    /**
     * 是否已删除
     */
    @TableField("is_deleted")
    private Byte isDeleted;
    /**
     * 是否启用
     */
    @TableField("enable")
    private Byte enable;

    /**
     * 用户所属部门 ID
     */
    @TableField("department_id")
    private Integer departmentId;
}
