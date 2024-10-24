package com.turnip.aiadmin.model.vo.user.login;

import com.turnip.aiadmin.model.vo.BaseVO;
import com.turnip.aiadmin.model.vo.user.register.UserRegisterVO;
import lombok.Data;

@Data
public class UserLoginVO extends BaseVO {
    private UserLoginData data;
    public static UserLoginVO create() {
        return new UserLoginVO();
    }

    public UserLoginVO setData(UserLoginData data) {
        this.data = data;
        return this;
    }
}
