package org.redis.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Data;

import java.util.Map;

@Data
public class VaultAuthModel {
    private Map<String, String> unseals;
    @JsonProperty("root-token")
    private String rootToken;
}
