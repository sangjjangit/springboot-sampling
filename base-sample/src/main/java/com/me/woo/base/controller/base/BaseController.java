package com.me.woo.base.controller.base;

import com.me.woo.base.domain.base.Base;
import com.me.woo.base.service.base.BaseService;
import com.me.woo.common.dto.ServiceDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Controller
public class BaseController {

    private final BaseService baseService;

    @GetMapping(value = "/base")
    public ResponseEntity selectBase() {
        Map<String, Object> result = new HashMap<>();

        Base base = baseService.selectBase("baseId");
        ServiceDto serviceDto = baseService.getDummy("dummyId");

        result.put("base", base);
        result.put("dummy", serviceDto.getData());
        return ResponseEntity.ok(result);
    }
}
