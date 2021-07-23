package com.diodi.admin.service;

import com.diodi.admin.bean.City;
import com.diodi.admin.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author diodi
 * @create 2021-06-06-13:26
 */
@Service
public class CityService {
    @Autowired
    CityMapper cityMapper;
    public City getById(Long id){
        return cityMapper.getByID(id);
    }
}
