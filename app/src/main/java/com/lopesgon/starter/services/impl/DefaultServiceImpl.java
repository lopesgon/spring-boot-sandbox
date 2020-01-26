package com.lopesgon.starter.services.impl;

import com.lopesgon.starter.entities.Default;
import com.lopesgon.starter.repositories.DefaultRepository;
import com.lopesgon.starter.services.DefaultServiceInterface;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

/**
 * DefaultServiceImpl
 */
@Component
@AllArgsConstructor
public class DefaultServiceImpl implements DefaultServiceInterface {

    private final DefaultRepository defaultRepository;

    @Override
    public Default getDefault(final Long id) {
        return defaultRepository.getOne(id);
    }

    @Override
    public Long saveDefault(final Default dflt) {
        final Default saved = defaultRepository.save(dflt);
        return saved.getId();
    }


    
}