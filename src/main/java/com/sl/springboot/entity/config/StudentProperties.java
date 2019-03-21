package com.sl.springboot.entity.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <p>配置文件属性封装测试
 *
 * @author kqyang
 * @version 1.0
 * @date 2019/3/21 15:51
 */
@Component
@ConfigurationProperties(prefix = "student")
public class StudentProperties {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
