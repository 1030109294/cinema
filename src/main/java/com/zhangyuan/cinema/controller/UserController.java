package com.zhangyuan.cinema.controller;

import com.zhangyuan.cinema.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 17925
 * @date 2021/12/25 14:38
 */
@Controller

public class UserController {

    @Autowired
   private  UserService userService;

    @RequestMapping("login.do")
    @ResponseBody
    public void login(String username , String password , HttpServletResponse response) throws IOException {
        Map<String ,Object> map = new HashMap<>();
      int result = userService.login(username , password);
      if (result == 1){
           response.sendRedirect("success.jsp");
      }else {
          response.sendRedirect("error.jsp");
      }

    }
}
