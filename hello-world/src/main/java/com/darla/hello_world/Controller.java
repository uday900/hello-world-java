package com.darla.hello_world;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public ResponseEntity<String> getHelloWorldMessage() {
        String content = """
        <!DOCTYPE html>
        <html lang="en">
        <head><meta charset="UTF-8"><title>Hello</title></head>
        <body><h1>Hello World from Spring Boot!</h1></body>
        </html>
        """;

        return ResponseEntity.ok()
                .contentType(MediaType.TEXT_HTML)
                .body(content);
    }
}
