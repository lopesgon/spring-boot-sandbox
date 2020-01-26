package com.lopesgon.starter.controllers;

import com.lopesgon.starter.entities.Default;
import com.lopesgon.starter.services.impl.DefaultServiceImpl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

/**
 * DefaultController
 */
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class DefaultController {

    private final DefaultServiceImpl defaultService;

    @GetMapping(value = "default")
    public Default getMethodName(@RequestParam Long id) {
        return defaultService.getDefault(id);
    }

    @PostMapping(value = "default")
    public Long getMethodName(@RequestParam String name) {
        Default dflt = Default.builder().name(name).build();
        return defaultService.saveDefault(dflt);
    }

}