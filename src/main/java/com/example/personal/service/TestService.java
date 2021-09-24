package com.example.personal.service;

import com.example.personal.entity.Test;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {

    public Test getTest(final Long id) {
        return Test.builder()
                .id(id)
                .name("sjh")
                .build();
    }
}
