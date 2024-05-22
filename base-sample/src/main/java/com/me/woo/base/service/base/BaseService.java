package com.me.woo.base.service.base;

import com.me.woo.base.domain.base.Base;
import com.me.woo.base.domain.base.BaseMapper;
import com.me.woo.base.domain.dummy.Dummy;
import com.me.woo.base.domain.dummy.DummyMapper;
import com.me.woo.common.dto.ServiceDto;
import com.me.woo.common.util.ServiceUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class BaseService {
    private final BaseMapper baseMapper;
    private final DummyMapper dummyMapper;
    private final ServiceUtil serviceUtil;

    public Base selectBase(String id) {
        return baseMapper.selectBase(id);
    }

    public ServiceDto getDummy(String id){
        Dummy dummy = dummyMapper.selectDummy(id);
        return ServiceDto.builder().data(dummy).build();
    }

    public Map<String, Object> getDummyMap(String id){
        Dummy dummy = dummyMapper.selectDummy(id);
        return serviceUtil.convertMap(dummy);
    }

    public ServiceDto getDummys(String id){
        List<Dummy> dummyList = dummyMapper.selectDummyList(id);
        return ServiceDto.builder().data(dummyList).build();
    }

    public List<Object> getDummyList(String id){
        List<Dummy> dummyList = dummyMapper.selectDummyList(id);
        return serviceUtil.convertList(dummyList);
    }

}
