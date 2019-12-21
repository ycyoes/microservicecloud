package com.turing.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
//boot --> spring applicationContext.xml --> @Configuration配置 =  applicationContext.xml
public class ConfigBean {	
	@Bean
	public RestTemplate geTemplate() {
		return new RestTemplate();
	}
}

//applicationContext.xml = ConfigBean(@Configuration)
//<bean id="userService" class="com.turing.springcloud.UserServiceImpl" />
