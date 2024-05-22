package com.me.woo.base.domain.dummy;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

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

    public List<Dummy> selectDummyList(String id) {

        Dummy dummy = new Dummy();
        dummy.setId(id);
        dummy.setName("dummylist name");

        List<Dummy> dummyList = new ArrayList<>();
        dummyList.add(dummy);

        return dummyList;
    }
}
