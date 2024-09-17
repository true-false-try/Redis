package org.redis.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.redis.dto.VaultAuthDto;
import org.redis.service.RedisService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/redis")
@RequiredArgsConstructor
public class RedisController {
    private final RedisService redisService;

    @GetMapping("getVaultAuth")
    @ResponseBody
    public ResponseEntity<VaultAuthDto> getVaultAuth(){
        log.info("Request is handling ...");
        VaultAuthDto vaultAuthDto = redisService.getVaultAuth();
        return ResponseEntity.ok(vaultAuthDto);
    }

}
