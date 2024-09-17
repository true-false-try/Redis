package org.redis.repository.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.redis.mapper.VaultAuthMapper;
import org.redis.model.VaultAuthModel;
import org.redis.repository.RedisRepository;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.JedisPooled;


import static org.redis.constants.RedisHashKeyConstant.HASH_KEY_VAULT_AUTH;

@Slf4j
@Repository
@RequiredArgsConstructor
public class RedisRepositoryImpl implements RedisRepository {
    private final JedisPooled jedisPooled;
    private final ObjectMapper objectMapper;

    @Override
    public VaultAuthModel getVaultAuth() {
        try {
            Object jsonObject = jedisPooled.jsonGet(HASH_KEY_VAULT_AUTH.getName());
            String jsonString = objectMapper.writeValueAsString(jsonObject);
            log.info("Find {} success: {}", HASH_KEY_VAULT_AUTH, jsonString);
            return objectMapper.readValue(jsonString, VaultAuthModel.class);
        } catch (Exception ex) {
            log.error(ex.getMessage());
            ex.printStackTrace();
            return null;
        }
    }
}
