package com.turnip.aiadmin.controller;


import com.turnip.aiadmin.model.dto.UserLoginDTO;
import com.turnip.aiadmin.model.dto.UserLoginHistroyDTO;
import com.turnip.aiadmin.model.entity.UserEntity;
import com.turnip.aiadmin.model.vo.role.RoleMenuList;
import com.turnip.aiadmin.model.vo.role.RoleMenuVO;
import com.turnip.aiadmin.model.vo.user.login.UserLoginData;
import com.turnip.aiadmin.model.vo.user.login.UserLoginVO;
import com.turnip.aiadmin.model.vo.user.register.UserRegisterData;
import com.turnip.aiadmin.model.vo.user.register.UserRegisterVO;
import com.turnip.aiadmin.model.vo.user.userinfo.UserInfoData;
import com.turnip.aiadmin.model.vo.user.userinfo.UserInfoVO;
import com.turnip.aiadmin.service.UserLoginHistoryService;
import com.turnip.aiadmin.service.UserService;
import com.turnip.aiadmin.service.intf.IRoleService;
import com.turnip.aiadmin.utils.IPUtil;
import com.turnip.aiadmin.utils.JwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IRoleService roleService;

    @Autowired
    private UserService userService;
    @Autowired
    private UserLoginHistoryService userLoginHistoryService;
    @GetMapping("/role/{id}/menu")
    public RoleMenuVO getRoleMenu(@PathVariable("id") Long id) {
        List<RoleMenuList> roleMenu = roleService.getRoleMenu(id);
        return  RoleMenuVO.create().setData(roleMenu).setReturnCode(0);
    }


    @GetMapping("/getUserInfo/{id}")
    public UserInfoVO getUserInfo(@PathVariable(value = "id") Long id) {
        System.out.println("id:"+id);
        UserInfoData userinfo = userService.getUserInfoById(id);
        System.out.println("userinfo"+userinfo);
        return UserInfoVO.create().setData(userinfo).setReturnCode(0);
    }

    @PostMapping("/register")
    public UserRegisterVO register(@RequestBody UserEntity userInfo){
        System.out.println("register info---:"+userInfo);
        System.out.println(userInfo);
        userService.save(userInfo);
        return  UserRegisterVO.create().setData("注册成功").<UserRegisterVO>setReturnCode(0);

    }



    @PostMapping("/login")
    public UserLoginVO login(@RequestBody UserLoginDTO userInfo, HttpServletRequest request){
        String remoteHost = IPUtil.getIpAddr(request);
//        System.out.println("remoteHost"+remoteHost);
        System.out.printf("userinfo%s%n", userInfo);
        List<UserEntity> userEntities = userService.getUserInfo(userInfo.getName());
        if(!userEntities.isEmpty()){// 用户存在
            UserLoginHistroyDTO userLoginHistroyDTO = new UserLoginHistroyDTO();
            userLoginHistroyDTO.setUserId(userEntities.getFirst().getId());
            userLoginHistroyDTO.setIpAddress(remoteHost);
            userLoginHistoryService.insertLastLoginInfo(userLoginHistroyDTO);
        }
//        System.out.println(userEntities);
        var token = JwtUtil.createToken(UUID.randomUUID().toString(),userInfo.getName(),new HashMap<>(){{put("name", "test");}});
        System.out.println(token);
//        System.out.println("test");
        UserLoginData dataList = new UserLoginData();
        dataList.setId(1);
        dataList.setToken(token);
        return UserLoginVO.create().setData(dataList).setReturnCode(0);
    }
    @GetMapping("/test")
    public String test(){

        return "hello";
    }
}
