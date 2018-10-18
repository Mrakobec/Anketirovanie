package com.company.anketirovanie.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum QuType implements EnumClass<Integer> {

    ONE(10),
    MANY(20),
    FREE(30);

    private Integer id;

    QuType(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static QuType fromId(Integer id) {
        for (QuType at : QuType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}