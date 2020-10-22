package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author GUO
 * @Classname HelloWordMainApplication
 * @Description TODO
 * @Date 2020/4/23 7:36
 */

/**
 * @SpringBootApplication 来标识一个主程序类,说明这是一个SpringBoot应用
 */
@SpringBootApplication
public class HelloWordMainApplication {
    public static void main(String[] args) {
        //Spring应用启动起来
        SpringApplication.run(HelloWordMainApplication.class, args);
    }
}
