package org.simple.lifeiseasy;

import org.simple.lifeiseasy.model.Item;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class LearnRedisApplication {
	
	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
	    return new JedisConnectionFactory();
	}
	
	@Bean
	public RedisTemplate<String, Item> redisTemplate() {
	    RedisTemplate<String, Item> template = new RedisTemplate<>();
	    template.setConnectionFactory(jedisConnectionFactory());
	    return template;
	}

	public static void main(String[] args) {
		SpringApplication.run(LearnRedisApplication.class, args);
	}

}
