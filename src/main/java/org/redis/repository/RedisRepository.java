package org.redis.repository;

import org.redis.model.VaultAuthModel;

public interface RedisRepository {
    VaultAuthModel getVaultAuth();
}
