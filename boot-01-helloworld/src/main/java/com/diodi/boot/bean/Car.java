package com.diodi.boot.bean;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author diodi
 * @create 2021-05-31-10:56
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand; // 品牌
    private Integer price; // 价格
}


