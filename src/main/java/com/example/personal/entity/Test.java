package com.example.personal.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class Test {

    private final Long id;
    private final String name;

}
