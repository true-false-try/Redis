package org.redis.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class VaultAuthModel {
    private List<String> unseals;
    @JsonProperty("root-token")
    private String rootToken;
}
