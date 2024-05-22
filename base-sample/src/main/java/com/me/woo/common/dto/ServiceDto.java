package com.me.woo.common.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Builder
public class ServiceDto {
    private Object data;

    public ServiceDto(Object data){
        this.data = data;
    }
}
