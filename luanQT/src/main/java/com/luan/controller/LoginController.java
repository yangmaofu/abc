package com.luan.controller;

import com.luan.entity.SessionUser;
import com.luan.model.User;
import com.luan.service.UserService;
import com.luan.utils.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 登录控制器   YU 修改 111  YU 再次修改
 * @author Administrator
 *
 */
@Controller
public class LoginController {

    @Autowired
    UserService userService;
    @RequestMapping("/index")
    public  String  index(){
        return  "login";
    }

    @RequestMapping("/login")
    @ResponseBody
    public Map<String,Object> login(User fromUser){
        Map<String,Object> retMap = new HashMap<>();
        User user = userService.findUserByUsername(fromUser.getUsername());
        if (user==null){
            retMap.put("msg","账号错误");
            retMap.put("success",false);
            return  retMap;
        }
        if (!user.getPassword().equals(fromUser.getPassword())){
            retMap.put("msg","账号错误");
            retMap.put("success",false);
            return retMap;
        }

        SessionUser sessionUser = new SessionUser();
        sessionUser.setUser(user);
        SessionUtils.setObject(sessionUser);
        retMap.put("success",true);
        return  retMap;
    }

    @RequestMapping("/main")
    public  String main(){
        return "index";
    }

    @RequestMapping("/logout")
    public String logout(){
        SessionUtils.invalidate();
        return "redirect:index.do";
    }
}
