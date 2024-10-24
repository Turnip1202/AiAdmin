package com.turnip.aiadmin.model.vo;

import com.turnip.aiadmin.model.vo.user.register.UserRegisterVO;
import lombok.Data;

@Data
abstract public class  BaseVO {
    private Integer returnCode;

    public <T> T setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
        return (T)this;
    }
}
