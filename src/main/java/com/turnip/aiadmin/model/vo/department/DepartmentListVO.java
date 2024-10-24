package com.turnip.aiadmin.model.vo.department;


import com.turnip.aiadmin.model.vo.BaseVO;
import lombok.Data;

@Data
public class DepartmentListVO extends BaseVO {
    private DepartmentList data;
    public static DepartmentListVO create(){
        return new DepartmentListVO();
    }
    public DepartmentListVO setData(DepartmentList data) {
        this.data = data;
        return this;
    }
}
