package com.turnip.aiadmin.model.vo.role;
import lombok.Data;
import java.util.List;
@Data
public class RoleMenuList {
    private Long id;
    private String name;
    private String icon;
    private Integer type;
    private  Integer sort;
    private String url;
    private String permission;
    private Long parentId;
  //  private List<RoleMenuList> children;
    private Object children;
}
