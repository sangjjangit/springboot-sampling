package com.me.woo.base.service.base;

import com.me.woo.base.domain.base.Base;
import com.me.woo.base.domain.base.BaseMapper;
import com.me.woo.base.domain.dummy.Dummy;
import com.me.woo.base.domain.dummy.DummyMapper;
import com.me.woo.common.dto.ServiceDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BaseService {
    private final BaseMapper baseMapper;
    private final DummyMapper dummyMapper;

    public Base selectBase(String id) {
        return baseMapper.selectBase(id);
    }

    public ServiceDto getDummy(String id){
        Dummy dummy = dummyMapper.selectDummy(id);
        return ServiceDto.builder().data(dummy).build();
    }

}
