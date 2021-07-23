package com.diodi.admin.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author diodi
 * @create 2021-06-03-16:32
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @TableField(exist = false)
    private String password;
    @TableField(exist = false)
    private String username;

    private Long id;
    private String name;
    private Integer age;
    private String email;
}
