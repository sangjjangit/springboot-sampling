package com.me.woo.base.domain.base;

import org.springframework.stereotype.Repository;

//@Component
@Repository
//@Mapper
//public interface BaseMapper {
public class BaseMapper {

    public Base selectBase(String id) {
        Base base = new Base();
        base.setId(id);
        base.setName("this is base name");
        return base;
    }
}
