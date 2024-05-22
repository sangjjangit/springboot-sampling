package com.me.woo.common.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Component
public class ServiceUtil {

    private final ObjectMapper objectMapper;

    public Map<String, Object> convertMap(Object object){
        return objectMapper.convertValue(object, Map.class);
    }
    public List<Object> convertList(Object object){
        return objectMapper.convertValue(object, List.class);
    }
}
