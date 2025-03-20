package com.bno.movie.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user/")
public class UserController {

    @PostMapping("login")
    public ResponseEntity<?> login() {
        List<String> items = new ArrayList<>();
        items.add("test1");
        items.add("test2");
        items.add("test3");
        return ResponseEntity.ok().body(items);
    }
}
