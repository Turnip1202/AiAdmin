package com.turnip.aiadmin.model.vo.department;

import com.turnip.aiadmin.model.vo.BaseListVO;
import lombok.Data;

import java.util.List;

@Data
public class DepartmentList  {
    private List<DepartmentListData> list;
}
