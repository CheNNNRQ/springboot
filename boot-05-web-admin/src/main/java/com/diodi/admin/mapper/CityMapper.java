package com.diodi.admin.mapper;

import com.diodi.admin.bean.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author diodi
 * @create 2021-06-06-13:14
 */
@Mapper
public interface CityMapper {
    @Select("select * from city where id=#{id}")
    City getByID(Long id);
}
