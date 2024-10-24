package com.turnip.aiadmin.model.vo.user.userinfo;

import com.turnip.aiadmin.model.vo.BaseVO;
import lombok.Data;

@Data
public class UserInfoVO extends BaseVO {
    private UserInfoData data;
    public static UserInfoVO create() {
        return new UserInfoVO();
    }
    public UserInfoVO setData(UserInfoData data) {
        this.data = data;
        return this;
    }
}
