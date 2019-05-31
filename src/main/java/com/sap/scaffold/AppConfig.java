package com.sap.scaffold;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "file:/etc/secrets/postgres/postgres.properties", ignoreResourceNotFound = true)
@PropertySource(value = "file:/etc/secrets/redis/redis.properties", ignoreResourceNotFound = true)
@PropertySource(value = "file:./mock/postgres.properties", ignoreResourceNotFound = true)
@PropertySource(value = "file:./mock/redis.properties", ignoreResourceNotFound = true)
public class AppConfig {
}
