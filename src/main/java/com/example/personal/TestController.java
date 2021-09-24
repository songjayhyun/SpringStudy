package com.example.personal;

import com.example.personal.component.ServerManager;
import com.example.personal.entity.Res;
import com.example.personal.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class TestController {

    private final ServerManager serverManager;
    private final TestService testService;

    @GetMapping("/test")
    public Map<String, Object> getTest() {
        return Map.of("serverPort", serverManager.getPort());
    }

    @GetMapping("/tests/{id}")
    public Res getTestById(
            @PathVariable Long id
    ) {
        return new Res(
                testService.getTest(id)
        );
    }
}
