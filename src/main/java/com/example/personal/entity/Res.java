package com.example.personal.entity;

import lombok.Getter;

@Getter
public class Res {
    private final Long id;
    private final String name;

    public Res(final Test test) {
        this.id = test.getId();
        this.name = test.getName();
    }
}
