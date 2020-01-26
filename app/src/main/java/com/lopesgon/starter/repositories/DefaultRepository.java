package com.lopesgon.starter.repositories;

import com.lopesgon.starter.entities.Default;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * DefaultRepository
 */
@Repository
public interface DefaultRepository extends JpaRepository<Default, Long> {
    
    Default getOne(Long id);
}