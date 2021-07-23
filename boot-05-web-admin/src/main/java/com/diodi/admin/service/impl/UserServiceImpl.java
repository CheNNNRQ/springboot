package com.diodi.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.diodi.admin.bean.User;
import com.diodi.admin.mapper.UserMapper;
import com.diodi.admin.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author diodi
 * @create 2021-06-06-16:56
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
