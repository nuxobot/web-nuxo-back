package com.nuxo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nuxoController {

    @GetMapping("/ping")
    public ResponseEntity ping(){
        return ResponseEntity.ok("Pong");
    }
}
