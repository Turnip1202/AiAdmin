package com.turnip.aiadmin.model.dto;

import lombok.Data;

@Data
public class UserLoginHistroyDTO {
    private Integer id;
    private Integer userId;
    private String ipAddress;
    private String loginTime;
}
