package com.lopesgon.starter.services;

import com.lopesgon.starter.entities.Default;

/**
 * DefaultServiceInterface
 */
public interface DefaultServiceInterface {

    Default getDefault(Long id);
    Long saveDefault(Default dflt);
}