package com.diodi.admin.mapper;

import com.diodi.admin.bean.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author diodi
 * @create 2021-06-05-23:16
 */
@Mapper
public interface AccountMapper {
    Account getAccount(Long id);
}
