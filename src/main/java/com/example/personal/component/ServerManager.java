package com.example.personal.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServerManager {

    @Value("${server.port}")
    private Integer serverPort;

    public Integer getPort() {
        return serverPort;
    }
}
