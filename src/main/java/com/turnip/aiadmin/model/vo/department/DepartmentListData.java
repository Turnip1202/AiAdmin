package com.turnip.aiadmin.model.vo.department;

import com.turnip.aiadmin.model.entity.DepartmentsEntity;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DepartmentListData {
    private Integer id;
    private String name;
    private Integer parentId;
    private String leader;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
