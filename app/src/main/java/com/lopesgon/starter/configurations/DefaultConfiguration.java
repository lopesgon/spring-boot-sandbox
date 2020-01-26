package com.lopesgon.starter.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * DefaultConfiguration
 */
@Configuration
@ConfigurationProperties(prefix = "custom")
public class DefaultConfiguration {

    String name;

}