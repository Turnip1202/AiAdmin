package com.turnip.aiadmin.model.vo.user.register;

import com.turnip.aiadmin.model.vo.BaseVO;
import lombok.Data;


@Data
public class UserRegisterVO extends BaseVO {
    private UserRegisterData data;
    public static UserRegisterVO create(){
        return new UserRegisterVO();
    }

    public UserRegisterVO setData(String msg) {
        UserRegisterData data = new UserRegisterData();
        data.setMsg(msg);
        this.data = data;
        return this;
    }
}
