package com.me.woo.base.domain.dummy;

import org.springframework.stereotype.Repository;

@Repository
//@Mapper
//public interface DummyMapper {
public class DummyMapper {

    public Dummy selectDummy(String id) {

        Dummy dummy = new Dummy();
        dummy.setId(id);
        dummy.setName("dummy name");

        return dummy;
    }
}
