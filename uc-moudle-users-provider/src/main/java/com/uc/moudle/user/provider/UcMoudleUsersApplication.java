package com.uc.moudle.user.provider;

import com.uc.moudle.user.provider.config.requestbodyhandler.CustomRequestFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@MapperScan(basePackages = "com.uc.moudle.user.provider.mappers")
@ServletComponentScan(basePackageClasses = {CustomRequestFilter.class})
public class UcMoudleUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(UcMoudleUsersApplication.class, args);
	}

}
