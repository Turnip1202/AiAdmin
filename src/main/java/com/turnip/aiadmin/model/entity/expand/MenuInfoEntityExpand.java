package com.turnip.aiadmin.model.entity.expand;

import com.turnip.aiadmin.model.entity.MenuInfoEntity;
import lombok.Data;

@Data
public class MenuInfoEntityExpand extends MenuInfoEntity {
    private Integer parentId;
}
