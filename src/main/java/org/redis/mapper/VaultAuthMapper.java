package org.redis.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.redis.dto.VaultAuthDto;
import org.redis.model.VaultAuthModel;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface VaultAuthMapper {
    VaultAuthDto toVaultAuthDto(VaultAuthModel model);
}
