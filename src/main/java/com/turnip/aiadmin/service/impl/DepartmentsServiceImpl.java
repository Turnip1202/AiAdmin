package com.turnip.aiadmin.service.impl;

import com.alibaba.fastjson2.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.turnip.aiadmin.model.entity.DepartmentsEntity;
import com.turnip.aiadmin.mapper.DepartmentsMapper;
import com.turnip.aiadmin.model.vo.department.DepartmentListData;
import com.turnip.aiadmin.model.vo.department.DepartmentListVO;
import com.turnip.aiadmin.service.intf.IDepartmentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Turnip
 * @since 2024-10-22
 */
@Service
public class DepartmentsServiceImpl extends ServiceImpl<DepartmentsMapper, DepartmentsEntity> implements IDepartmentsService {

    @Autowired
    private DepartmentsMapper departmentsMapper;
    @Override
    public List<DepartmentListData> getDepartmentList() {
        List<DepartmentsEntity> departmentList = departmentsMapper.getDepartmentList();
        ArrayList<DepartmentListData> departmentListData = new ArrayList<DepartmentListData>() ;
        //遍历departmentList，合并到departmentListVO中
        for (DepartmentsEntity val : departmentList) {
            DepartmentListData dataTemp = new DepartmentListData();
            dataTemp.setId(val.getId());
            dataTemp.setParentId(val.getParentId());
            dataTemp.setName(val.getDepartmentName());
            dataTemp.setLeader(val.getLeader());
            dataTemp.setCreateAt(val.getCreateAt());
            dataTemp.setUpdateAt(val.getUpdateAt());
            departmentListData.add(dataTemp);
        }
        //将departmentListVO转成json数据
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list",departmentListData);
        System.out.println("json"+jsonObject.toJSONString());

        return departmentListData;
    }
}
