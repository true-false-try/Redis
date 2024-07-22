package org.redis.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisPooled;

@Configuration
public class RedisConfig {
    @Value("${redis.host}")
    private String host;
    @Value("${redis.port}")
    private Integer port;
    @Value("${redis.database}")
    private Integer database;
    @Value("${redis.username}")
    private String username;
    @Value("${redis.password}")
    private String password;

    @Bean
    public JedisPooled jedisPooled() {
        return new JedisPooled(host, port, username, password);
    }

}
