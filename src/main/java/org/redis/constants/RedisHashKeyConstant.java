package org.redis.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public enum RedisHashKeyConstant {
    HASH_KEY_VAULT_AUTH("vault-auth");

    private final String name;
}
