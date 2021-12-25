package com.zhangyuan.cinema.service.impl;

import com.zhangyuan.cinema.dao.UserDao;
import com.zhangyuan.cinema.domain.User;
import com.zhangyuan.cinema.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 17925
 * @date 2021/12/25 14:47
 */
@Service("userService")
public class UserServiceImpl implements UserService {

   @Autowired
    private UserDao userDao;
    @Override
    public int login(String username, String password) {
        Map<String , String> map = new HashMap<>();
        map.put("username" , username);
        map.put("password" , password);
        int result = 0;
       User user = userDao.selectUserByOne(map);
       if (user == null){
         return result;
       }else {
           result = 1;
           return result;
       }
    }
}
