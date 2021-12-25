package com.zhangyuan.cinema.dao;

import com.zhangyuan.cinema.domain.User;

import java.util.Map;

public interface UserDao {
    User selectUserByOne(Map<String, String> map);
}
