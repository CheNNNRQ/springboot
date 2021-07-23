package com.diodi.admin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author diodi
 * @create 2021-06-06-13:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {
    private Long id;
    private String name;
    private String state;
    private String country;
}
