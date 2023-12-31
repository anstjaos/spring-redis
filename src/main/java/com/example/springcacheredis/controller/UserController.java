package com.example.springcacheredis.controller;

import com.example.springcacheredis.domain.entity.RedisHashUser;
import com.example.springcacheredis.domain.entity.User;
import com.example.springcacheredis.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser2(id);
    }

    @GetMapping("/redishash-users/{id}")
    public RedisHashUser getRedisHashUser(@PathVariable Long id) {
        return userService.getRedisHashUser(id);
    }
}
