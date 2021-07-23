package com.diodi.admin;

import com.diodi.admin.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@SpringBootTest
class Boot05WebAdminApplicationTests {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    DataSource dataSource;
    @Autowired
    UserMapper userMapper;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Test
    void testRedis(){
        ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
        operations.set("name", "diodi");
        String name = operations.get("name");
        System.out.println(name);
    }

    @Test
    void contextLoads() {
//        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from customers");
        Long aLong = jdbcTemplate.queryForObject("select count(*) from customers" , Long.class);
        System.out.println(aLong);
        System.out.println(dataSource.getClass());
    }
    @Test
    void t1(){
        System.out.println(userMapper.selectById(1L));
    }

}
