package com.diodi.admin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author diodi
 * @create 2021-06-05-23:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private Long id ;
    private String userId ;
    private Integer money ;

}
