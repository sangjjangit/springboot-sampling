package com.me.woo.common.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;

@Getter
@NoArgsConstructor
@Builder
public class ServiceDto {

    private Object data;

    public ServiceDto(Object data){
        this.data = data;
    }

    public String toDataString(){
        return new Gson().toJson(this.data);
    }

}
