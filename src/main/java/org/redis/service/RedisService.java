package org.redis.service;

import org.redis.dto.VaultAuthDto;

public interface RedisService {
    VaultAuthDto getVaultAuth();
}
