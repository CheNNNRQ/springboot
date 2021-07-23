package com.diodi.admin.service;

import com.diodi.admin.bean.Account;
import com.diodi.admin.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author diodi
 * @create 2021-06-06-0:48
 */
@Service
public class AccountService {
    @Autowired
    AccountMapper accountMapper;

    public Account getById(Long id){
        Account account = accountMapper.getAccount(id);
        return account;
    }
}
