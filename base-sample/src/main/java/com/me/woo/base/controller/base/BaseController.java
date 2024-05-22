package com.me.woo.base.controller.base;

import com.me.woo.base.domain.base.Base;
import com.me.woo.base.service.base.BaseService;
import com.me.woo.common.dto.ServiceDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Controller
public class BaseController {

    private final BaseService baseService;

    @GetMapping(value = "/base")
    public ResponseEntity selectBase() {
        Map<String, Object> result = new HashMap<>();

        Base base = baseService.selectBase("baseId");
        ServiceDto dummy = baseService.getDummy("dummy");
        Map<String, Object> dummyMap = baseService.getDummyMap("dummyMap");
        ServiceDto dummys = baseService.getDummys("dummys");
        List<Object> dummyList = baseService.getDummyList("dummyList");

        result.put("base", base);
        result.put("dummy", dummy.getData());
        result.put("dummyString", dummy.toDataString());
        result.put("dummyMap", dummyMap);
        result.put("dummys", dummys.getData());
        result.put("dummysString", dummys.toDataString());
        result.put("dummyList", dummyList);
        return ResponseEntity.ok(result);
    }
}
