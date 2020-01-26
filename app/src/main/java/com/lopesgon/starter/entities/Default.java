package com.lopesgon.starter.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Default
 */
@Entity
@Builder
@Getter
@Setter
public class Default {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private boolean active;

    @Override
    public String toString() {
        return String.format("Customer[id=%d, name='%s', active='%s']", id, name, active);
    }
}