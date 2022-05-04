package com.company.sampletransportorders.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum StatusOrder implements EnumClass<String> {

    NEW("A"),
    CONSIDERED("B"),
    SUBMITTED("C"),
    DONE("D"),
    REJECTED("E"),
    DECLINED("F");

    private String id;

    StatusOrder(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static StatusOrder fromId(String id) {
        for (StatusOrder at : StatusOrder.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}