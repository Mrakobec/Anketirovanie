package com.company.anketirovanie.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum True_false implements EnumClass<Integer> {

    True(10),
    False(20);

    private Integer id;

    True_false(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static True_false fromId(Integer id) {
        for (True_false at : True_false.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}