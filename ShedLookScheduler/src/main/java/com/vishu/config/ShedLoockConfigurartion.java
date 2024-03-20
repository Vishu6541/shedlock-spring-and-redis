package com.vishu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

import net.javacrumbs.shedlock.core.LockProvider;
import net.javacrumbs.shedlock.provider.redis.spring.RedisLockProvider;

@Configuration
public class ShedLoockConfigurartion {

	 	@Bean
	    LockProvider lockProvider(RedisTemplate<String, String> redisTemplate) {
	        return new RedisLockProvider(redisTemplate.getConnectionFactory());
	    }
}