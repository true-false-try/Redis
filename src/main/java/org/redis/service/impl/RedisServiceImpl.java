package org.redis.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.Mapper;
import org.redis.dto.VaultAuthDto;
import org.redis.mapper.VaultAuthMapper;
import org.redis.model.VaultAuthModel;
import org.redis.repository.RedisRepository;
import org.redis.service.RedisService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class RedisServiceImpl implements RedisService {
    private final RedisRepository redisRepository;
    private final VaultAuthMapper vaultAuthMapper;

    @Override
    public VaultAuthDto getVaultAuth() {
        VaultAuthModel vaultAuthModel = redisRepository.getVaultAuth();
        return vaultAuthMapper.toVaultAuthDto(vaultAuthModel);
    }
}
