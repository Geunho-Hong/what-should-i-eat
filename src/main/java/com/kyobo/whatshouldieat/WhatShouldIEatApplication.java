package com.kyobo.whatshouldieat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// 초기 RDB 미설정으로 인해 임시 DataSourceAutoConfiguration.class 설정 추가
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class WhatShouldIEatApplication {

    public static void main(String[] args) {
        SpringApplication.run(WhatShouldIEatApplication.class, args);
    }

}
